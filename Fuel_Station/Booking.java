<html>
<head>
<title>Booking.java</title>
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
Booking.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">Fuel_Station</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">Booking </span><span class="s2">{</span>
    <span class="s0">private </span><span class="s1">String bookingNumber</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">Vehicle vehicle</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">String date</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">String time</span><span class="s2">;</span>
    <span class="s0">private </span><span class="s1">String status</span><span class="s2">;</span>

    <span class="s0">public </span><span class="s1">Booking</span><span class="s2">(</span><span class="s1">String bookingNumber</span><span class="s2">, </span><span class="s1">Vehicle vehicle</span><span class="s2">, </span><span class="s1">String date</span><span class="s2">, </span><span class="s1">String time</span><span class="s2">) {</span>
        <span class="s0">this</span><span class="s2">.</span><span class="s1">bookingNumber </span><span class="s2">= </span><span class="s1">bookingNumber</span><span class="s2">;</span>
        <span class="s0">this</span><span class="s2">.</span><span class="s1">vehicle </span><span class="s2">= </span><span class="s1">vehicle</span><span class="s2">;</span>
        <span class="s0">this</span><span class="s2">.</span><span class="s1">date </span><span class="s2">= </span><span class="s1">date</span><span class="s2">;</span>
        <span class="s0">this</span><span class="s2">.</span><span class="s1">time </span><span class="s2">= </span><span class="s1">time</span><span class="s2">;</span>
        <span class="s0">this</span><span class="s2">.</span><span class="s1">status </span><span class="s2">= </span><span class="s3">&quot;Confirmed&quot;</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public </span><span class="s1">String getBookingNumber</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">bookingNumber</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public </span><span class="s1">Vehicle getVehicle</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">vehicle</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public </span><span class="s1">String getDate</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">date</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public </span><span class="s1">String getTime</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">time</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public </span><span class="s1">String getStatus</span><span class="s2">() {</span>
        <span class="s0">return </span><span class="s1">status</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">public void </span><span class="s1">setStatus</span><span class="s2">(</span><span class="s1">String status</span><span class="s2">) {</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">status</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s3">&quot;Confirmed&quot;</span><span class="s2">) || </span><span class="s1">status</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s3">&quot;Cancelled&quot;</span><span class="s2">)) {</span>
            <span class="s0">this</span><span class="s2">.</span><span class="s1">status </span><span class="s2">= </span><span class="s1">status</span><span class="s2">;</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;Error: Status must be Confirmed or Cancelled&quot;</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>

    <span class="s0">public void </span><span class="s1">printDetails</span><span class="s2">() {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;_____________________________________&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;Booking Number : &quot; </span><span class="s2">+ </span><span class="s1">bookingNumber</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;Status         : &quot; </span><span class="s2">+ </span><span class="s1">status</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;Date &amp; Time    : &quot; </span><span class="s2">+ </span><span class="s1">date </span><span class="s2">+ </span><span class="s3">&quot; at &quot; </span><span class="s2">+ </span><span class="s1">time</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;Vehicle Info   : &quot; </span><span class="s2">+ </span><span class="s1">vehicle</span><span class="s2">.</span><span class="s1">getInfo</span><span class="s2">());</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s3">&quot;_____________________________________&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>
<span class="s2">}</span></pre>
</body>
</html>