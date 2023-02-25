package javaProject02;

public abstract class Marks {
    abstract double getPercentage ();
}

class StudentA extends Marks {

    double mathMarks;
    double PhysicsMarks;
    double informationTechnologyMarks;

    StudentA (double mathMarks, double PhysicsMarks, double informationTechnologyMarks) {
        this.mathMarks=mathMarks;
        this.PhysicsMarks=PhysicsMarks;
        this.informationTechnologyMarks=informationTechnologyMarks;
    }

    @Override
    double getPercentage() {
        return (mathMarks+PhysicsMarks+informationTechnologyMarks)/3;
    }
}

class StudentB extends Marks {

    double mathMarks;
    double PhysicsMarks;
    double informationTechnologyMarks;

    double islamicStudies;

    StudentB (double mathMarks, double PhysicsMarks, double informationTechnologyMarks, double islamicStudies) {
        this.mathMarks=mathMarks;
        this.PhysicsMarks=PhysicsMarks;
        this.informationTechnologyMarks=informationTechnologyMarks;
        this.islamicStudies=islamicStudies;
    }

    @Override
    double getPercentage() {
        return (mathMarks+PhysicsMarks+informationTechnologyMarks+islamicStudies)/4;
    }
}
