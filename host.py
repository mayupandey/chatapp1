import time
import socket
import sys

print("welcome to chat room")
print("")
print("initialising....")
time.sleep(1)

s=socket.socket()
host=socket.gethostname()
port=8080
s.bind((host,port))
print("")
print(host)
print("")
name=input(str("please enter username"))
           
s.listen(1)
print("")
print("waiting for incoming connections")
print("")
conn,addr=s.accept()
print("received connection")

s_name=conn.recv(1024)
s_name=s_name.decode()
print("")
print(s_name,"has connected to the chat")
print("")
conn.send(name.encode())

while 1:
           message=input(str("please send your message"))
           print("")
           conn.send(message.encode())
           print("Sent")
           message=conn.recv(1024)
           message=message.decode()
           print("")
           print(name,":",message)
           print("")
                         
