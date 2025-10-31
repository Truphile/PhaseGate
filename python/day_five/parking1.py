car_slots = [0] * 20  


def enter_parking_lot(car_number):
    for check in range(len(car_slots)):
        if car_slots[check] == 0:
            car_slots[check] = car_number
            print(f"Car {car_number} parked in slot {check + 1}")
            display_status()
            return
    print(f"Parking lot full! Car {car_number} cannot enter.")


def leave_parking_lot(slot_number):
    if slot_number < 1 or slot_number > 20:
        print("Invalid slot number!")
        return
    if car_slots[slot_number - 1] == 0:
        print(f"Slot {slot_number} is already empty!")
    else:
        print(f"Car {car_slots[slot_number - 1]} left slot {slot_number}")
        car_slots[slot_number - 1] = 0
    display_status()


def display_status():
    print("Parking Status:", car_slots)


