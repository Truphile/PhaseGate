from parking1 import *

def main_menu():
    while True:
        print("\n=== Welcome to Dev's Parking Lot ===")
        print("1. Enter Parking Lot")
        print("2. Leave Parking Lot")
        print("3. Display Status")
        print("4. Exit")
        choice = input("Choose an option: ")

        if choice == "1":
            try:
                car_number = int(input("Enter car number: "))
                enter_parking_lot(car_number)
            except ValueError:
                print("Invalid car number!")
        elif choice == "2":
            try:
                slot_number = int(input("Enter slot number to leave: "))
                leave_parking_lot(slot_number)
            except ValueError:
                print("Invalid slot number!")
        elif choice == "3":
            display_status()
        elif choice == "4":
            print("Exiting...")
            break
        else:
            print("Invalid option!")



main_menu()
