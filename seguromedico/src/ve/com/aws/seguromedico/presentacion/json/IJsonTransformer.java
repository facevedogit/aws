package ve.com.aws.seguromedico.presentacion.json;

public interface IJsonTransformer {

	String toJson(Object data);

	Object fromJson(String json, Class clazz);
}
