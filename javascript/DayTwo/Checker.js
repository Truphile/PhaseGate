 let sumUnique(let[] numbers) {
       	
        let total = 0;
        for (let check = 0; check < numbers.length - 1; check++) {
            if (numbers[check] != numbers[check + 1]) {
                total += numbers[check];
            }
        }
        return total;
    }
}
