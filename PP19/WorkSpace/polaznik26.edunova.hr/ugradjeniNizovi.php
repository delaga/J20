<?php

echo "<pre>";
var_dump($_GET);
echo "</pre>";
echo "<hr />";
echo "<pre>";
var_dump($_POST);
echo "</pre>";
echo "<hr />";
echo "<pre>";
session_start();
var_dump($_SESSION);
echo "</pre>";
echo "<hr />";
echo "<pre>";
var_dump($_COOKIE);
echo "</pre>";
echo "<hr />";
echo "<pre>";
var_dump($GLOBALS);
echo "</pre>";
echo "<hr />";
echo "<pre>";
var_dump($_FILES);
echo "</pre>";
echo "<hr />";

echo "<pre>";
var_dump($_REQUEST);
echo "</pre>";
echo "<hr />";

echo "<pre>";
var_dump($_ENV);
echo "</pre>";
echo "<hr />";


echo "<pre>";
var_dump($_SERVER);
echo "</pre>";
echo "<hr />";

