package il.co.radware.hwqa_equipment_tool.cache;

public interface ICacheController {
    public Object get(Object key);

    public void put(String key, Object value);

}