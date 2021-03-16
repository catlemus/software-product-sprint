/**
 * Adds a random fact to the page.
 */


function addRandomFact() {
  const facts =
      ['I have 4 pet dogs', 'My favorite color is Purple', 'I have a bird named Elvis', 'I LOVE Sour Patches'];

  // Pick a random greeting.
  const fact = facts[Math.floor(Math.random() * facts.length)];

  // Add it to the page.
  const factContainer = document.getElementById('facts-container');
  factContainer.innerText = fact;
}

//Fetch

async function showServletMessage() {

  const responseFromServer = await fetch('/hello');
  const facts = await responseFromServer.json();

  const factContainer = document.getElementById('servlet-container');
  factContainer.innerText = facts[0];

  console.log(facts[0]);
  console.log(facts[1]);
  console.log(facts[2]);

}

