# search
my first search engine!

## OOD Comments

OOD for PA #9
        OOA   <- in the docx files is this a type-o?


you kind of jump right into OOD2, so it is a bit difficulty to see how some of
the java types tie back to the OOA.

work on being intensional in your datatype decisions.  for each type chosen
you should be able to explain why that type is a good choice.

same thing for return types.  for example, why do "searchSingleQuery"
and "searchMultiQuery" return different types?

i do not understand what "Parse word by space" means.  is this 'parse a
multi-word query string by separating the words using whitespace'?

likewise something went wrong in "For words in the parse, if they are matching
to every word in the parse, ...." where 'they' refers back to the words of the
parse.

is "buildQuery()" really 'buildIndex'?

"if(map.getordefault(word in scanner)" ... what scanner?
you need to restrict references to attributes of the class or formal parameter
of the method.

if 'Setup' is a class i don't care for the name.  the client never speaks of a
setup (i.e., uses the word as a noun).  the services under it 'buildQuery' and
'buildStoplist' also need greater detail and greater specification regarding the
steps that make up *how*.  i suspect that you would benifit from playing computer 
and doing the process my hand with pen and paper before trying to specify the
steps in the abstract (which programming requires).


## OOA Comments

the add stoplist and add document use-cases are not really user initiated
actions.  they are part of initializing the inverted index (which happens
before the user "arrives".

it looks like you uncovered zero attributes.  in order to function the program
must need to retain some information.  think about what information a search
engine has to keep track of.

one place to start is with the services. in order for each service to perform
its actions what information does it need?  for example, consider "Retrieve
documents with a certain word."






## Examples

The JavaDoc for the game OneRowNim can be fount at

  <a href="https://f19-cs312-loyola.github.io/Nim"> JavaDoc served from GitHub Pages </a>
  
  <a href="http://www.cs.loyola.edu/~binkley/312/src/javadoc-examples/Nim.docs"> JavaDoc served from Linux </a>


The directory `testing` includes a simple test case.  Note that the script 
`test0` assumes that your code is in its parent directory.



#README
compile, run this command, then input. Search is same for single and multi query
java CLI -d /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/stoplist /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/doc1 /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/doc2 /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/doc3
java CLI /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/stoplist /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/doc1 /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/doc2 /home/mjhiggins2/cs312/r-for-retrieval-Higgs32584/testing/doc3




