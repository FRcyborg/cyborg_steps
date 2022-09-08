def harmonic_sum(n):
    if n < 2:
        return 1
    else:
        return 1 / n + (harmonic_sum(n-1))

def main():
    print("0  => ", harmonic_sum(0))
    print("7  => ", harmonic_sum(7))
    print("8  => ", harmonic_sum(8))
    print("13 => ", harmonic_sum(13))
    print("24 => ", harmonic_sum(24))

main()

