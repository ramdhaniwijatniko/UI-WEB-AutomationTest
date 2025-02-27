Feature: Pengujian batas pada form login

  Scenario: User login dengan username kosong
    Given Pengguna membuka halaman login
    When Pengguna memasukkan username "" dan password "validPassword"
    And Pengguna menekan tombol login
    Then Pengguna melihat pesan error "Epic sadface: Username is required"

  Scenario: User login dengan password kosong
    Given Pengguna membuka halaman login
    When Pengguna memasukkan username "validUser" dan password ""
    And Pengguna menekan tombol login
    Then Pengguna melihat pesan error "Epic sadface: Password is required"

Scenario: User login dengan username dan password kosong
  Given Pengguna berada di halaman login
  When Pengguna memasukkan username ""
  And Pengguna memasukkan password ""
  And Pengguna mengklik tombol login
  Then Pengguna tetap di halaman login
