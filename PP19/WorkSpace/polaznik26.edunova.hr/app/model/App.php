<?php
    class App 
    {
        public static function start()
        {
            $pathInfo= Request::pathinfo();
            $pathParts =explode("/",$pathInfo);
            if(!isset($pathParts[1]) || empty($pathParts[1])){
                $controller="Index";
            }else{
                $controller=ucfirst(strtolower($pathParts[1]));
            }
            $controller .= "Controller";

            //echo $controller."-&gt;";
            
            if(!isset($pathParts[2]) || empty($pathParts[2])){
                $function="Index";
            }else{
                $function=strtolower($pathParts[2]);
            }

            //echo $function;

            if(class_exists($controller) && method_exists($controller,$function)){
                $instanca= new $controller();
                $instanca->$function();
            }else{
                header ("HTTP/1.0 404 Not Found");
            }
        }
    }