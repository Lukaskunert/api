package cz.educanet.webik;

import javax.enterprise.context.ApplicationScoped;

import javax.ws.rs.core.Response;

import java.util.ArrayList;

import java.lang.Math;

@ApplicationScoped
    public class Manager {

        private ArrayList<Hra> games = new ArrayList<>();
        public ArrayList<Hra> getGames(){
        return hry;
    }
        public boolean create(Hra hra) {

            if(hra.getHodnoceni() < 0 || hra.getHodnoceni() > 100)
                return false;

        public Hra getHra (int id){
            return  hry.stream()
                    .filter(hraStream -> id == hraStream.getIdco())
                    .findAny()
                    .orElse(null);
        }

        public boolean hraCheck(int id) {
            for (int i = 0; i < 100; i++){
                if (id != hry.get(id).id) {
                    return false;
                }
            } return true;
        }

        public boolean removeHra(int idco){
            return  hry.remove(getGame(idco));
        }
        public boolean editHra(int idco){
            return true;
        }

    }
