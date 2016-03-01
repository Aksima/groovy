def raindrops = new Raindrops()
try {
    assert raindrops.convert(1)     == '1'
    assert raindrops.convert(3)     == 'Pling'
    assert raindrops.convert(5)     == 'Plang'
    assert raindrops.convert(6)     == 'Pling'
    assert raindrops.convert(7)     == 'Plong'
    assert raindrops.convert(9)     == 'Pling'
    assert raindrops.convert(10)    == 'Plang'
    assert raindrops.convert(14)    == 'Plong'
    assert raindrops.convert(15)    == 'PlingPlang'
    assert raindrops.convert(21)    == 'PlingPlong'
    assert raindrops.convert(25)    == 'Plang'
    assert raindrops.convert(35)    == 'PlangPlong'
    assert raindrops.convert(49)    == 'Plong'
    assert raindrops.convert(52)    == '52'
    assert raindrops.convert(105)   == 'PlingPlangPlong'
    assert raindrops.convert(12121) == '12121'
} catch(AssertionError error) {
    println error.message
}
