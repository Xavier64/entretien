// Read inputs from Standard Input (use readline()).
// Write outputs to Standard Output (use print()).


const n = parseInt(readline());
const q = parseInt(readline());
console.log(readline(n));

let mimeMap = {};

function getMimeType ( fileName )
{
    let qArray = fileName.split(".");
    if ( qArray.length > 1 )
    {
        let extension = qArray.pop().toLowerCase();
        if( mimeMap[extension] )
        {
            return (mimeMap[extension]);
        }
    }
    return "UNKNOWN";
}
console.log(getMimeType(fileName));

for (let i = 0; i < n; i++) {
    let FNAME = readline().split(" ");
    mimeMap[FNAME[0].toLowerCase()] = FNAME[1];
}

for( let j = 0 ; j < q ; j++ )
{
    print (getMimeType(readline()));
}