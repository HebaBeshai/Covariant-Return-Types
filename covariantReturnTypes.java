

//Complete the classes below
class Flower {
    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    
    String whatsYourName(){
        return "Jasmine";
    } 
}

class Lily extends Flower {
    
    String whatsYourName(){
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower(){
        Flower obj = new Flower();
        return obj;
    }
}

class WestBengal extends Region{
    @Override
    Jasmine yourNationalFlower(){
      Jasmine obj = new Jasmine();
      return obj;
    }
}

class AndhraPradesh extends Region {
        @Override
    Lily yourNationalFlower(){
        Lily obj = new Lily();
        return obj;

    }
}

