<?php

class IndexController
{
    public function index()
    {
       $view = new View();

       $view->render("index");
    }

    public function onama()
    {
       $view = new View();

       $view->render("onama");
    }

    public function kontakt()
    {
       $view = new View();

       $view->render("kontakt");
    }

    public function login()
    {
      $view = new View();

       $view->render("login");
    }

    public function autoriziraj()
    {
      $view = new View();

      if(App::param("email")!="" || App::param("password"!="") ){
            //na bazu
      }else{
         $view->render("login",["greska"=>"Obavezan unos"]);
      }
      

      

       
    }
}