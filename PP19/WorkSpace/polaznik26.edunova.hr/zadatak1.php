<?php
$p=[1,2];
$i=1;$j=0;

$p[0]+=++$i;
$p[1]=$p[1]+ ++$j;
$s=0;
foreach($p as $k=>$v){
    $s+=$v;
}
echo $s;
