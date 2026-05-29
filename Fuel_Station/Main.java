<html>
<head>
<title>Main.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #2aacb8;}
.s4 { color: #6aab73;}
</style>
</head>
<body bgcolor="#191a1c">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Main.java</font>
</center></td></tr></table>
<pre><span class="s0">package </span><span class="s1">Fuel_Station</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">ArrayList</span><span class="s2">;</span>
<span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">Scanner</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">Main </span><span class="s2">{</span>

    <span class="s0">static </span><span class="s1">ArrayList</span><span class="s2">&lt;</span><span class="s1">Booking</span><span class="s2">&gt; </span><span class="s1">bookings </span><span class="s2">= </span><span class="s0">new </span><span class="s1">ArrayList</span><span class="s2">&lt;&gt;();</span>

    <span class="s0">static int </span><span class="s1">bookingCounter </span><span class="s2">= </span><span class="s3">0</span><span class="s2">;</span>

    <span class="s0">static </span><span class="s1">Scanner scanner </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Scanner</span><span class="s2">(</span><span class="s1">System</span><span class="s2">.</span><span class="s1">in</span><span class="s2">);</span>

    <span class="s0">static </span><span class="s1">String makeBooking</span><span class="s2">(</span><span class="s1">Vehicle vehicle</span><span class="s2">, </span><span class="s1">String date</span><span class="s2">, </span><span class="s1">String time</span><span class="s2">) {</span>
        <span class="s1">bookingCounter</span><span class="s2">++;</span>
        <span class="s1">String number </span><span class="s2">= </span><span class="s4">&quot;FSB-&quot; </span><span class="s2">+ </span><span class="s1">bookingCounter</span><span class="s2">;</span>
        <span class="s1">Booking bkk </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Booking</span><span class="s2">(</span><span class="s1">number</span><span class="s2">, </span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">, </span><span class="s1">time</span><span class="s2">);</span>

        <span class="s1">bookings</span><span class="s2">.</span><span class="s1">add</span><span class="s2">(</span><span class="s1">bkk</span><span class="s2">);</span>
        <span class="s0">return </span><span class="s1">number</span><span class="s2">;</span>
    <span class="s2">}</span>

    <span class="s0">static </span><span class="s1">String makeBooking</span><span class="s2">(</span><span class="s1">Vehicle vehicle</span><span class="s2">, </span><span class="s1">String date</span><span class="s2">) {</span>
        <span class="s0">return </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">, </span><span class="s4">&quot;08:30&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">static </span><span class="s1">String makeBookingTruck</span><span class="s2">(</span><span class="s1">Vehicle vehicle</span><span class="s2">, </span><span class="s1">String date</span><span class="s2">) {</span>
        <span class="s0">return </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">, </span><span class="s4">&quot;09:00&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">public static void </span><span class="s1">main</span><span class="s2">(</span><span class="s1">String</span><span class="s2">[] </span><span class="s1">args</span><span class="s2">) {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;      Fuel Station Booking              &quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;&quot;</span><span class="s2">);</span>

        <span class="s0">boolean </span><span class="s1">running </span><span class="s2">= </span><span class="s0">true</span><span class="s2">;</span>

        <span class="s0">while </span><span class="s2">(</span><span class="s1">running</span><span class="s2">) {</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;    MAIN MENU   &quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;1. Book for Car&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;2. Book for Motorcycle&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;3. Book for Truck&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;4. Check book&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;5. Cancel book&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;6. View All bookings&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;7. Exit&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Choose: &quot;</span><span class="s2">);</span>

            <span class="s1">String choice </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

            <span class="s0">if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;1&quot;</span><span class="s2">)) {</span>
                <span class="s1">bookCar</span><span class="s2">();</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;2&quot;</span><span class="s2">)) {</span>
                <span class="s1">Motorcycle</span><span class="s2">();</span>
            <span class="s2">}</span><span class="s0">else if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;3&quot;</span><span class="s2">)) {</span>
                <span class="s1">bookTruck</span><span class="s2">();</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;4&quot;</span><span class="s2">)) {</span>
                <span class="s1">checkBook</span><span class="s2">();</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;5&quot;</span><span class="s2">)) {</span>
                <span class="s1">cancelBook</span><span class="s2">();</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;6&quot;</span><span class="s2">)) {</span>
                <span class="s1">viewAll</span><span class="s2">();</span>
            <span class="s2">} </span><span class="s0">else if </span><span class="s2">(</span><span class="s1">choice</span><span class="s2">.</span><span class="s1">equals</span><span class="s2">(</span><span class="s4">&quot;7&quot;</span><span class="s2">)) {</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Goodbye&quot;</span><span class="s2">);</span>
                <span class="s1">running </span><span class="s2">= </span><span class="s0">false</span><span class="s2">;</span>
            <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
                <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Invalid choice. Try again.&quot;</span><span class="s2">);</span>
            <span class="s2">}</span>
        <span class="s2">}</span>
    <span class="s2">}</span>

    <span class="s0">static void </span><span class="s1">bookCar</span><span class="s2">() {</span><span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;--- Book for Car  ---&quot;</span><span class="s2">);</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Your Name: &quot;</span><span class="s2">);</span>
        <span class="s1">String name </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Plate Number: &quot;</span><span class="s2">);</span>
        <span class="s1">String plate </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Fuel Type (Petrol/Diesel): &quot;</span><span class="s2">);</span>
        <span class="s1">String fuel </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Date: &quot;</span><span class="s2">);</span>
        <span class="s1">String date </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Time (or press Enter for 08:30): &quot;</span><span class="s2">);</span>
        <span class="s1">String time </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">Vehicle vehicle </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Car</span><span class="s2">(</span><span class="s1">name</span><span class="s2">, </span><span class="s1">plate</span><span class="s2">, </span><span class="s1">fuel</span><span class="s2">);</span>
        <span class="s1">String number</span><span class="s2">;</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">time</span><span class="s2">.</span><span class="s1">isEmpty</span><span class="s2">()) {</span>
            <span class="s1">number </span><span class="s2">= </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">);</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">number </span><span class="s2">= </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">, </span><span class="s1">time</span><span class="s2">);</span>
        <span class="s2">}</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Booking Confirmed!&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;  Your Booking Number: &quot; </span><span class="s2">+ </span><span class="s1">number</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;  Show this number at the station.&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>



    <span class="s0">static void </span><span class="s1">Motorcycle</span><span class="s2">() {</span><span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;--- Book for Motorcycle  ---&quot;</span><span class="s2">);</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Your Name: &quot;</span><span class="s2">);</span>
        <span class="s1">String name </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Plate Number: &quot;</span><span class="s2">);</span>
        <span class="s1">String plate </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Date: &quot;</span><span class="s2">);</span>
        <span class="s1">String date </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Time (or press Enter for 08:30): &quot;</span><span class="s2">);</span>
        <span class="s1">String time </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">Vehicle vehicle </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Motorcycle</span><span class="s2">(</span><span class="s1">name</span><span class="s2">, </span><span class="s1">plate</span><span class="s2">);</span>
        <span class="s1">String number</span><span class="s2">;</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">time</span><span class="s2">.</span><span class="s1">isEmpty</span><span class="s2">()) {</span>
            <span class="s1">number </span><span class="s2">= </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">);</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">number </span><span class="s2">= </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">, </span><span class="s1">time</span><span class="s2">);</span>
        <span class="s2">}</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Booking Confirmed!&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;  Your Booking Number: &quot; </span><span class="s2">+ </span><span class="s1">number</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;  Show this number at the station.&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>

    
    <span class="s0">static void </span><span class="s1">bookTruck</span><span class="s2">() {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;--- Book for Truck  ---&quot;</span><span class="s2">);</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Your Name: &quot;</span><span class="s2">);</span>
        <span class="s1">String name </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Plate Number: &quot;</span><span class="s2">);</span>
        <span class="s1">String plate </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Is trailer? (yes/no): &quot;</span><span class="s2">);</span>
        <span class="s1">String trailer </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s0">boolean </span><span class="s1">istrailer </span><span class="s2">= </span><span class="s1">trailer</span><span class="s2">.</span><span class="s1">equalsIgnoreCase</span><span class="s2">(</span><span class="s4">&quot;yes&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Date: &quot;</span><span class="s2">);</span>
        <span class="s1">String date </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Time (or press Enter for 09:00): &quot;</span><span class="s2">);</span>
        <span class="s1">String time </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">Vehicle vehicle </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Truck</span><span class="s2">(</span><span class="s1">name</span><span class="s2">, </span><span class="s1">plate</span><span class="s2">,</span><span class="s1">trailer </span><span class="s2">,</span><span class="s1">istrailer</span><span class="s2">);</span>

        <span class="s1">String number</span><span class="s2">;</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">time</span><span class="s2">.</span><span class="s1">isEmpty</span><span class="s2">()) {</span>
            <span class="s1">number </span><span class="s2">= </span><span class="s1">makeBookingTruck</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">);</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">number </span><span class="s2">= </span><span class="s1">makeBooking</span><span class="s2">(</span><span class="s1">vehicle</span><span class="s2">, </span><span class="s1">date</span><span class="s2">, </span><span class="s1">time</span><span class="s2">);</span>
        <span class="s2">}</span>

        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Booking Confirmed!&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;  Your Booking Number: &quot; </span><span class="s2">+ </span><span class="s1">number</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;  Show this number at the station.&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">static void </span><span class="s1">checkBook</span><span class="s2">() {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;--- Check Appointment ---&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Enter Booking Number (e.g. FSB-1): &quot;</span><span class="s2">);</span>
        <span class="s1">String number </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">Booking found </span><span class="s2">= </span><span class="s1">findBooking</span><span class="s2">(</span><span class="s1">number</span><span class="s2">);</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">found </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s1">found</span><span class="s2">.</span><span class="s1">printDetails</span><span class="s2">();</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;No Booking found with number: &quot; </span><span class="s2">+ </span><span class="s1">number</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>

    <span class="s0">static void </span><span class="s1">cancelBook</span><span class="s2">() {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;--- Cancel Booking ---&quot;</span><span class="s2">);</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s4">&quot;Enter Booking Number to cancel: &quot;</span><span class="s2">);</span>
        <span class="s1">String number </span><span class="s2">= </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextLine</span><span class="s2">();</span>

        <span class="s1">Booking found </span><span class="s2">= </span><span class="s1">findBooking</span><span class="s2">(</span><span class="s1">number</span><span class="s2">);</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">found </span><span class="s2">!= </span><span class="s0">null</span><span class="s2">) {</span>
            <span class="s1">found</span><span class="s2">.</span><span class="s1">setStatus</span><span class="s2">(</span><span class="s4">&quot;Cancelled&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Booking &quot; </span><span class="s2">+ </span><span class="s1">number </span><span class="s2">+ </span><span class="s4">&quot; has been cancelled.&quot;</span><span class="s2">);</span>
        <span class="s2">} </span><span class="s0">else </span><span class="s2">{</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;No Booking found with number: &quot; </span><span class="s2">+ </span><span class="s1">number</span><span class="s2">);</span>
        <span class="s2">}</span>
    <span class="s2">}</span>
    <span class="s0">static void </span><span class="s1">viewAll</span><span class="s2">() {</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;--- All Bookings ---&quot;</span><span class="s2">);</span>
        <span class="s0">if </span><span class="s2">(</span><span class="s1">bookings</span><span class="s2">.</span><span class="s1">isEmpty</span><span class="s2">()) {</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;No bookings yet.&quot;</span><span class="s2">);</span>
            <span class="s0">return</span><span class="s2">;</span>
        <span class="s2">}</span>
        <span class="s0">for </span><span class="s2">(</span><span class="s1">Booking a </span><span class="s2">: </span><span class="s1">bookings</span><span class="s2">) {</span>
            <span class="s1">a</span><span class="s2">.</span><span class="s1">printDetails</span><span class="s2">();</span>
        <span class="s2">}</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s4">&quot;Total: &quot; </span><span class="s2">+ </span><span class="s1">bookings</span><span class="s2">.</span><span class="s1">size</span><span class="s2">() + </span><span class="s4">&quot; Booking(s).&quot;</span><span class="s2">);</span>
    <span class="s2">}</span>

    <span class="s0">static </span><span class="s1">Booking findBooking</span><span class="s2">(</span><span class="s1">String number</span><span class="s2">) {</span>
        <span class="s0">for </span><span class="s2">(</span><span class="s1">Booking a </span><span class="s2">: </span><span class="s1">bookings</span><span class="s2">) {</span>
            <span class="s0">if </span><span class="s2">(</span><span class="s1">a</span><span class="s2">.</span><span class="s1">getBookingNumber</span><span class="s2">().</span><span class="s1">equalsIgnoreCase</span><span class="s2">(</span><span class="s1">number</span><span class="s2">)) {</span>
                <span class="s0">return </span><span class="s1">a</span><span class="s2">;</span>
            <span class="s2">}</span>
        <span class="s2">}</span>
        <span class="s0">return null</span><span class="s2">;</span>
    <span class="s2">}</span>
<span class="s2">}</span>

</pre>
</body>
</html>