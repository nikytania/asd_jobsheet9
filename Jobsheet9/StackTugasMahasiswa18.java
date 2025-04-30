package  Jobsheet9;

public class StackTugasMahasiswa18 {
  Mahasiswa18[] stack;
  int top;
  int size;

  public StackTugasMahasiswa18(int size) {
    this.size = size;
    stack = new Mahasiswa18[size];
    top = -1;
  }
  public boolean isFull() {
    if (top == size -1) {
      return true;
    } else {
      return false;
    }
  }
  public boolean isEmpty() {
    if (top == -1) { // no size
      return true;
    } else {
      return false;
    }
  }
  public void push(Mahasiswa18 mhs) {
    if (!isFull()) {
      top++;
      stack[top] = mhs;
    } else {
      System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
    }
  }
  public Mahasiswa18 pop() {
    if (!isEmpty()) {
      Mahasiswa18 m = stack[top];
      top--;
      return m;
    } else {
      System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
      return null;
    }
  }
  public Mahasiswa18 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
      return null;
    }
  }
  public void print() {
    for (int i = top; i >= 0; i--) { //yang pertama mengumpulkan ada di bawah
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println("");
  }
}
