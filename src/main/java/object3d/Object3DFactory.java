package object3d;

public class Object3DFactory {

    public static IObject3D createObject3D(String type){
        Class objClass = null;
        Object object = null;

        try{
            objClass = Class.forName("object3d." + type);
            object = objClass.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Class does not exist.");
        }

        if(!(object instanceof IObject3D)){
            throw new IllegalArgumentException("Invalid object.");
        }

        return (IObject3D) object;

    }
}
