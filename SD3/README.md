# System Design 3


**Designing Dropbox**

**What to be designed?**

1. Storing files in the cloud allows users to store their data on remote servers. 
2. These servers are usually maintained by cloud storage providers and made available to users over a network (usually via the Internet).
3. Let's design a file hosting service such as Google Drive or Dropbox. 

**Feature Requirements**

Primary Features:

1. Users should be able to upload their files / photos and download them from any device. 
2. Our service should support automatic device synchronization, i.e. it should get synchronized on all devices after updating a file on one device. 
3. The system should support storing up to a GB of large files.
4. Users must have the option to share files or folders with other users. 

Secondary Requirements:

1. We need ACID-ity. It should guarantee atomicity, consistency, isolation and durability of all file operations. 
Our system should support the editing offline. 
2. Users should be able to add / delete / modify files while offline, and all their changes should be synchronized to remote servers and other online devices as soon as they come online.

Extended Features:
1. Versioning

**TO DO : Follow the below framweork to design System. Mandatory upload of hand drawn photos of design.**

**Capacity Estimation and Constraints**

What will your estimations of scale? As a system design student you should be able to make intelligent assumptions based on real life systems. 

**System APIs**

**Database Design**

**Basic System Design and Algorithm**

**Data Partitioning and Replication**

**Caching**

**Load Balancing**

**Handling Edge cases in given system**



