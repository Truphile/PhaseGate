import unittest

from parking1 import *

class testParkingLot(unittest.TestCase):
	
 
    def test_enter_first_car(self):
        result = parking.enter_parking_lot(123)
        self.assertEqual(result, "Car 123 parked in slot 1")
        self.assertEqual(parking.car_slots[0], 123)

    def test_fill_all_slots(self):
        for check in range(20):
            parking.enter_parking_lot(check + 1)
        result = parking.enter_parking_lot(700)
        self.assertEqual(result, "Parking lot full! Car 700 cannot enter.")

    def test_leave_car(self):
        parking.enter_parking_lot(101)
        result = parking.leave_parking_lot(1)
        self.assertEqual(result, "Car 101 left slot 1")
        self.assertEqual(parking.car_slots[0], 0)

    def test_leave_empty_slot(self):
        result = parking.leave_parking_lot(5)
        self.assertEqual(result, "Slot 5 is already empty!")

    def test_invalid_slot_number(self):
        result = parking.leave_parking_lot(25)
        self.assertEqual(result, "Invalid slot number!")



