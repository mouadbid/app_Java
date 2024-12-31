# app_Java
### Project Description

The project is a server-based auction system where clients can participate in real-time auctions hosted on the server. The system handles multiple auctions and allows clients to interact with the server to place bids and monitor auction activities.

---

### Features

1. **Auction Initialization**:
   - An auction is created by entering the item's details and the starting price into the server.

2. **Client Participation**:
   - Clients connect to the server and select the auction they are interested in.

3. **Real-Time Bidding**:
   - Once an auction starts, clients can submit their bids in real-time.
   - The server receives the bid amount along with the client’s information.

4. **Timeout Handling**:
   - If no new bids are submitted within 10 seconds, the server sends a warning message to all connected clients, notifying them that the auction will close if no further bids are placed within the next 10 seconds.

5. **Auction Closure**:
   - The auction ends when no new bids are received within the allotted time. The server declares the highest bidder as the winner and finalizes the auction.

---

This system creates an interactive and dynamic auction environment where clients can actively participate, and the server ensures fair handling of bids and smooth operation of the auction process.