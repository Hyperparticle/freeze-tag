grammar FreezeTag;
start: WS? statement (SEP_S statement)* WS?;
statement: subject (WS predicate)?;
subject: node;
predicate: relation WS node;

node: (nodeType WS)? nodeProperty (WS nodeProperty)* | nodeType;

nodeType: TYPE_S ID;
nodeProperty: PROP_S ID WS ID;
// TODO: request individual properties

relation: PROP_S ID;

SEP_S: ';';
TYPE_S: '@';
PROP_S: '#' | '+' | '-';
//REQ_S: '?';

ID: [a-zA-Z0-9]+;
WS: [ \t\r\n]+;
