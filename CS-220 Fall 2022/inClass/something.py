def pow(x,n):
      #precondition: x and n are positive integers
      if ( n==0 ):
            return 1
      else:
            return x * pow(x, n-1)

def main():
      print("hello world")

      print(pow(2,8))

if __name__ == "__main__":
      main()
