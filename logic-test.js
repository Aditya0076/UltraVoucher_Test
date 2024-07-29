function sortString(str) {
    return str.split('').sort().join('');
}

function groupAnagrams(words) {
    var anagramMap = {};

    for (var i = 0; i < words.length; i++) {
        var word=words[i];
        var sortedWord = sortString(word);
        if (!anagramMap[sortedWord]) {
            anagramMap[sortedWord] = [];
        }
        anagramMap[sortedWord].push(word);
    }

    var result = [];
    for(var key in anagramMap) {
        result.push(anagramMap[key]);
    }
    return result;
}

var words = ['cook', 'save', 'taste', 'aves', 'vase', 'state', 'map'];
var anagramGroups = groupAnagrams(words);
console.log(anagramGroups);