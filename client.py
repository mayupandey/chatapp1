import time
import socket
import sys

print("welcome to chat room")
print("")
print("initialising....")
time.sleep(1)

s=socket.socket()
print("")
host=input(str("please enter server address"))
print("")
name=input(str("please enter your name"))
port=8080
print("")
print("trying to connect to",host,"at port",port)
print("")
time.sleep(1)
s.connect((host,port))
print("connected...")

s.send(name.encode())
s_name=s.recv(1024)
s_name=s_name.decode()
print("")
print(s_name,"has joined the chat")

while 1:
    message=s.recv(1024)
    message=message.decode()
    print("")
    print(name,":",message)
    print("")
    message=input(str("please enter your meessage"))
    print("")
    s.send(message.encode())
    print("sent")
    
