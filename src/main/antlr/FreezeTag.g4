grammar FreezeTag;
start: statement (SEP_S statement)*;
statement: WS? subject (WS? predicate)? WS?;
subject: node;
predicate: relation WS? node;

node: (nodeType WS?)? nodeProperty (WS? nodeProperty)* | nodeType;

nodeType: TYPE_S ID;
nodeProperty: PROP_S ID WS string;
// TODO: request individual properties

relation: PROP_S ID;

string: (ID | WS)+;

SEP_S: ';';
TYPE_S: '@';
PROP_S: '#' | '+' | '-';

ID: ~([ \t\r\n] | '"' | '\'' | ';' | '@' | '#' | '+' | '-')+;
WS: [ \t\r\n]+;
