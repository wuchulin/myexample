package com.myexample.base.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonResult {
	
	protected static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(JsonResult.class);

	private boolean success;
	private String message;
	private String id;

	public static class DataSequnce {
		Map<String, String> _datas = null;

		public static DataSequnce create() {
			return new DataSequnce();
		}

		public DataSequnce add(String key, String value) {
			_datas.put(key, value);
			return this;
		}
		
		public Map<String, String> toMap() {
			return _datas;
		}
		
		public Set<Map.Entry<String, String>> toSet() {
			return _datas.entrySet();
		}
		
		/**
		 * 保持json返回的顺序
		 * @return
		 */
		public JSONArray toJsonArray() {
			JSONArray array = new JSONArray();
			for (Map.Entry<String, String> entry : _datas.entrySet()) {
				JSONObject object = new JSONObject();
				try {
					object.put("key", entry.getKey());
					object.put("value", entry.getValue());
				} catch (JSONException e) {
					log.warn("插入值错误：{}", entry.toString());
				}
				array.put(object);
			}
			return array;
		}
		
		private DataSequnce() {
			_datas = new LinkedHashMap<String, String>();
		}
	}

	private Map<String, String> datas = new LinkedHashMap<String, String>();

	public JsonResult(boolean success, String message, Map<String, String> datas) {
		super();
		this.success = success;
		this.message = message;
		this.datas = datas;
	}

	public JsonResult(boolean success, Map<String, String> datas) {
		super();
		this.success = success;
		this.datas = datas;
	}

	public JsonResult(boolean success, String message, String id) {
		super();
		this.message = message;
		this.success = success;
		this.id = id;
	}

	public JsonResult(boolean success, String message, Long id) {
		this(success, message, String.valueOf(id));
	}

	public JsonResult(boolean success, String message) {
		super();
		this.message = message;
		this.success = success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, String> getDatas() {
		return datas;
	}
	
	public void addData(DataSequnce datas) {
		if (datas == null) return;
		this.datas.putAll(datas.toMap());
	}

	public void addData(String key, String value) {
		if (this.datas == null)
			this.datas = new LinkedHashMap<String, String>();

		this.datas.put(key, value);
	}

	@SuppressWarnings("unchecked")
	public void addData(JSONObject json) {
		if (json == null) return;
		for (Iterator<String> iterator = json.keys(); iterator.hasNext();) {
			String name = (String) iterator.next();
			try {
				this.addData((String) name, (String)json.get(name));
			} catch (JSONException e) {
				log.warn("获取JSON错误");
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void addError(JSONObject json) {
		if (json == null) return;
		for (Iterator<String> iterator = json.keys(); iterator.hasNext();) {
			String name = (String) iterator.next();
			try {
				this.addData((String) name, (String)json.get(name));
			} catch (JSONException e) {
				log.warn("获取JSON错误");
			}
		}
	}

	public String toJSONString() {
		JSONObject result = new JSONObject();
		try {
			result.put("id", this.id);
			result.put("success", this.success);
			result.put("message", this.message);

			if (datas != null && datas.size() > 0) {
				JSONObject datasJSON = new JSONObject();
				for (String key : datas.keySet()) {
					datasJSON.put(key, datas.get(key));
				}
				result.put("data", datasJSON);
			}
		} catch (JSONException e) {
			log.warn("JSON转换错误");
		}

		String str = null;
		if (log.isTraceEnabled()) {
			try {
				str = result.toString(2);
				log.trace(str);
			} catch (JSONException e) {
				log.warn("JSON输出错误");
			}
		} else {
			str = result.toString();
		}

		return str;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setId(Long id) {
		this.id = String.valueOf(id);
	}
}
