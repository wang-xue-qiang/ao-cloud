package com.zkh.cloud.utils.json;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zkh.cloud.utils.string.StringUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * @Description: json相关工具类
 * @author wangxueqiang
 * @date 4018年11月13日 下午1:33:43
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class JsonUtils {
	
	
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * 
     * @Description: 
     * @param list
     * @return
     * @author wangxueqiang
     * @date 4018年11月13日 下午4:56:40
     *
     */
    public static JSONArray List2Json(List<?> list){
        JSONArray json = JSONArray.fromObject(list);     
        return json;
   }
    /**
     * 将对象转换成json字符串。
     * <p>Title: pojoToJson</p>
     * <p>Description: </p>
     * @param data
     * @return
     */
    public static String objectToJson(Object data) {
    	try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	return null;
    }
    
    /**
     * 将json结果集转化为对象
     * @param jsonData json数据
     * @param clazz 对象中的object类型
     * @return
     */
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
    
    /**
     * 将json数据转换成pojo对象list
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
    	JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
    	try {
    		List<T> list = MAPPER.readValue(jsonData, javaType);
    		return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return null;
    }
	/**
	 * 从一个JSON 对象字符格式中得到一个java对象
	 * @param jsonString
	 * @param pojoCalss
	 * @return
	 */
	
	public static Object getObject4JsonString(String jsonString, Class pojoCalss) {
		Object pojo;
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		pojo = JSONObject.toBean(jsonObject, pojoCalss);
		return pojo;
	}

	/**
	 * 从json HASH表达式中获取一个map，改map支持嵌套功能
	 * @param jsonString
	 * @return
	 */
	public static Map getMap4Json(String jsonString) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		Iterator keyIter = jsonObject.keys();
		String key;
		Object value;
		Map valueMap = new HashMap();
		while (keyIter.hasNext()) {
			key = (String) keyIter.next();
			value = jsonObject.get(key);
			valueMap.put(key, value);
		}

		return valueMap;
	}

	/**
	 * 从json数组中得到相应java数组
	 * @param jsonString
	 * @return
	 */
	public static Object[] getObjectArray4Json(String jsonString) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		return jsonArray.toArray();

	}

	/**
	 * 从json对象集合表达式中得到一个java对象列表
	 * @param jsonString
	 * @param pojoClass
	 * @return
	 */
	public static List getList4Json(String jsonString, Class pojoClass) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		JSONObject jsonObject;
		Object pojoValue;
		List list = new ArrayList();
		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject = jsonArray.getJSONObject(i);
			pojoValue = JSONObject.toBean(jsonObject, pojoClass);
			list.add(pojoValue);
		}
		return list;

	}

	/**
	 * 从json数组中解析出java字符串数组
	 * @param jsonString
	 * @return
	 */
	public static String[] getStringArray4Json(String jsonString) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		String[] stringArray = new String[jsonArray.size()];
		for (int i = 0; i < jsonArray.size(); i++) {
			stringArray[i] = jsonArray.getString(i);
		}
		return stringArray;
	}

	/**
	 * 从json数组中解析出javaLong型对象数组
	 * @param jsonString
	 * @return
	 */
	public static Long[] getLongArray4Json(String jsonString) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		Long[] longArray = new Long[jsonArray.size()];
		for (int i = 0; i < jsonArray.size(); i++) {
			longArray[i] = jsonArray.getLong(i);
		}
		return longArray;
	}

	/**
	 * 从json数组中解析出java Integer型对象数组
	 * @param jsonString
	 * @return
	 */
	public static Integer[] getIntegerArray4Json(String jsonString) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		Integer[] integerArray = new Integer[jsonArray.size()];
		for (int i = 0; i < jsonArray.size(); i++) {
			integerArray[i] = jsonArray.getInt(i);
		}
		return integerArray;
	}

	/**
	 * 从json数组中解析出java Integer型对象数组
	 * @param jsonString
	 * @return
	 */
	public static Double[] getDoubleArray4Json(String jsonString) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		Double[] doubleArray = new Double[jsonArray.size()];
		for (int i = 0; i < jsonArray.size(); i++) {
			doubleArray[i] = jsonArray.getDouble(i);
		}
		return doubleArray;
	}

	/**
	 * 将java对象转换成json字符串
	 * @param javaObj
	 * @return
	 */
	public static String getJsonString4JavaPOJO(Object javaObj) {
		JSONObject json;
		json = JSONObject.fromObject(javaObj);
		return json.toString();
	}

	/**
	 * 将java对象转化为json字符串
	 * @param obj
	 * @return
	 */
	public static String toJSONString(Object obj) {
		return JSON.toJSONString(obj, new SerializerFeature[]
				{ SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat });
	}

	/**
	 * 将json数据转化为java对象，统一调用此方法
	 * @param result
	 * @param clazz
	 * @return
	 */
	public static <T> T jsonToObject(String result, Class<T> clazz)	{
		if (StringUtils.isNotEmpty(result)) {
			return JSON.parseObject(result, clazz);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("k1", "v1");
		System.out.println(objectToJson(map));
	}
}
