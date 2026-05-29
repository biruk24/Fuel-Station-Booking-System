<html>
<head>
<title>Car.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #6aab73;}
</style>
</head>
<body bgcolor="#191a1c">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Car.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">Fuel_Station</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">Car </span><span class="s0">extends </span><span class="s1">Vehicle </span><span class="s2">{</span>
    <span class="s0">private </span><span class="s1">String fuelType</span><span class="s2">;</span>

    <span class="s0">public </span><span class="s1">Car</span><span class="s2">(</span><span class="s1">String ownerName</span><span class="s2">, </span><span class="s1">String PlateNumber</span><span class="s2">, </span><span class="s1">String vehicleType</span><span class="s2">) {</span>
        <span class="s0">super</span><span class="s2">(</span><span class="s1">ownerName</span><span class="s2">, </span><span class="s1">PlateNumber</span><span class="s2">, </span><span class="s1">vehicleType</span><span class="s2">);</span>
        <span class="s0">this</span><span class="s2">.</span><span class="s1">fuelType </span><span class="s2">= </span><span class="s1">fuelType</span><span class="s2">;</span>

    <span class="s2">}</span>
    <span class="s0">public </span><span class="s1">String getfuelType</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">fuelType</span><span class="s2">;</span>
    <span class="s2">}</span>
    <span class="s1">@Override</span>
    <span class="s0">public </span><span class="s1">String getInfo</span><span class="s2">(){</span>
        <span class="s0">return </span><span class="s3">&quot;Car | Owner: &quot; </span><span class="s2">+ </span><span class="s1">getOwnerName</span><span class="s2">() + </span><span class="s3">&quot; | Plate: &quot; </span><span class="s2">+ </span><span class="s1">getPlatenumber</span><span class="s2">() + </span><span class="s3">&quot; | Fuel: &quot; </span><span class="s2">+ </span><span class="s1">fuelType</span><span class="s2">;</span>

    <span class="s2">}</span>

<span class="s2">}</span>


</pre>
</body>
</html>