Feature: Login

  Scenario: Login dengan kredensial valid
    Given Pengguna berada di halaman login
    When Pengguna memasukkan username "standard_user"
    And Pengguna memasukkan password "secret_sauce"
    And Pengguna mengklik tombol login
    Then Pengguna diarahkan ke dashboard utama

Scenario: Login dengan kredensial tidak valid
  Given Pengguna berada di halaman login
  When Pengguna memasukkan username "invalid_user"
  And Pengguna memasukkan password "wrong_password"
  And Pengguna mengklik tombol login
  Then Pengguna tetap di halaman login