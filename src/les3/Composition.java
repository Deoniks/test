package les3;

public class Composition {
    private Particle particle;

    public Composition(){
        this.particle = new Particle();
    }
    public Composition(String  name){
        this.particle = new Particle(name);
    }
    public Particle getParticle(){
        return  this.particle;
    }
    public void setParticle(Particle particle){
        this.particle = particle;
    }
}
