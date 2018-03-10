# Demo scenario

Documents already in SEROCU's database:

* The Hound of the Baskervilles, lvl 3 (Secret), *covered*
	* Keywords: England, Dartmoor, Devon, Devonshire, hound, Henry Baskerville, Sherlock Holmes, Arthur Conan Doyle
* Murder on the Orient Express, lvl 1 (Official)
	* Keywords: Simplon Orient Express, Bouc, Samuel Ratchett, Calais, Hercule Poirot, Agatha Christie, London

1. SEROCU, Inspector Lestrade (glestrade, lvl 3) logs in
2. glestrade adds a new document:
	* Jack_the_Ripper.docx, lvl 2 (Official Sensitive)
	* Keywords: England, London, Whitechapel, Leather Apron, Annie Chapman, 29 Hanbury Street, Spitalfields

3. Another ROCU, Ms Marple (jmarple, lvl 1) logs in
4. jmarple searches for "London"
5. jmarple gets one answer: _Murder on the Orient Express_ (autoapproved)

6. Another ROCU, S. Holmes (sholmes, lvl 3) logs in
7. sholmes searches for "England"
8. sholmes gets one answer: _Jack_the_Ripper_ (autoapproved)

9. SEROCU, glestrade goes to review page and also approves the Baskervilles hound case
10. Another ROCU, sholmes can now see two matches: Autoapproved _Jack the Ripper_ and _The Hound of the Baskervilles_.