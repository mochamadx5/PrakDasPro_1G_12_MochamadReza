����   B �  $semester2/pertemuan3/MahasiswaDemo12  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this &Lsemester2/pertemuan3/MahasiswaDemo12; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V   semester2/pertemuan3/Mahasiswa12
  		     ! out Ljava/io/PrintStream;   # $ % makeConcatWithConstants (I)Ljava/lang/String;
 ' ) ( java/io/PrintStream * + println (Ljava/lang/String;)V - NIM : 
 ' / 0 + print
  2 3 4 nextLine ()Ljava/lang/String;	  6 7 8 nim Ljava/lang/String; : Nama : 	  < = 8 nama ? Kelas : 	  A B 8 kelas D IPK : 
 F H G java/lang/Float I J 
parseFloat (Ljava/lang/String;)F	  L M N ipk F P -------------------------------  #  S $ T &(Ljava/lang/String;)Ljava/lang/String;  S  S  X $ Y (F)Ljava/lang/String; [ !--------------------------------  args [Ljava/lang/String; sc Ljava/util/Scanner; arrayofMahasiswa12 #[Lsemester2/pertemuan3/Mahasiswa12; dummy i I StackMapTable ] a 
SourceFile MahasiswaDemo12.java BootstrapMethods
 l n m $java/lang/invoke/StringConcatFactory $ o �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; k r Masukkan Data Mahasiswa ke-  t NIM :  v Nama :  x 	Kelas :  z IPK  InnerClasses } %java/lang/invoke/MethodHandles$Lookup  java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      �    � Y� � L� M6� y,� Y� S� `� "  � &� ,� .,2+� 1� 5� 9� .,2+� 1� ;� >� .,2+� 1� @� C� .+� 1N,2-� E� K� O� &����6� e� `� Q  � &� ,2� 5� R  � &� ,2� ;� U  � &� ,2� @� V  � &� ,2� K� W  � &� Z� &�����    
   f           !  0  8  C  K  V  ^  i  q  v  �  �  �  �  �  �  �  �  �   �   "    >    \ ]    � ^ _   � ` a  v  b 8    c d  � k c d  e    �   f  g   � u� a  h    i j   &  p  q p  q p  s p  u p  w p  y {   
  | ~ � 