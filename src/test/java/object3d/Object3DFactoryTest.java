package object3d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Object3DFactoryTest {

    @Test
    void deveRetornarCuboRenderizado(){
        IObject3D object = Object3DFactory.createObject3D("Cube");

        assertEquals("Cube rendered.", object.render());
    }
    @Test
    void deveRetornarEsferaRenderizada(){
        IObject3D object = Object3DFactory.createObject3D("Sphere");

        assertEquals("Sphere rendered.", object.render());
    }

    @Test
    void deveRetornarPiramideRenderizada(){
        IObject3D object = Object3DFactory.createObject3D("Pyramid");

        assertEquals("Pyramid rendered.", object.render());
    }

    @Test
    void deveRetornarExcecaoClasseNaoExiste(){

        try{
            IObject3D object = Object3DFactory.createObject3D("Cone");
            fail();
        }catch (Exception e){
            assertEquals("Class does not exist.", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoObjetoInvalido(){

        try{
            IObject3D object = Object3DFactory.createObject3D("Square");
            fail();
        }catch (Exception e){
            assertEquals("Invalid object.", e.getMessage());
        }
    }


}