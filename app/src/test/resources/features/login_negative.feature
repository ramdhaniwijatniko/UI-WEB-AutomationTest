Feature: Login Negative Scenarios

  Scenario: User login dengan username kosong
    Given Pengguna berada di halaman login
    When Pengguna memasukkan username ""
    And Pengguna memasukkan password "secret_sauce"
    And Pengguna mengklik tombol login
    Then Pengguna melihat pesan error "Epic sadface: Username is required"
