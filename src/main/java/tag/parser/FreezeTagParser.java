// Generated from C:/Users/hyper/Documents/GitHub/freeze-tag/src/main/antlr\FreezeTag.g4 by ANTLR 4.6
package tag.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FreezeTagParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEP_S=1, TYPE_S=2, PROP_S=3, ID=4, WS=5;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_subject = 2, RULE_predicate = 3, 
		RULE_node = 4, RULE_nodeType = 5, RULE_nodeProperty = 6, RULE_relation = 7, 
		RULE_string = 8;
	public static final String[] ruleNames = {
		"start", "statement", "subject", "predicate", "node", "nodeType", "nodeProperty", 
		"relation", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEP_S", "TYPE_S", "PROP_S", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FreezeTag.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FreezeTagParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEP_S() { return getTokens(FreezeTagParser.SEP_S); }
		public TerminalNode SEP_S(int i) {
			return getToken(FreezeTagParser.SEP_S, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			statement();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP_S) {
				{
				{
				setState(19);
				match(SEP_S);
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FreezeTagParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FreezeTagParser.WS, i);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(26);
				match(WS);
				}
			}

			setState(29);
			subject();
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(30);
					match(WS);
					}
				}

				setState(33);
				predicate();
				}
				break;
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(36);
				match(WS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			node();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public TerminalNode WS() { return getToken(FreezeTagParser.WS, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			relation();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(42);
				match(WS);
				}
			}

			setState(45);
			node();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext {
		public List<NodePropertyContext> nodeProperty() {
			return getRuleContexts(NodePropertyContext.class);
		}
		public NodePropertyContext nodeProperty(int i) {
			return getRuleContext(NodePropertyContext.class,i);
		}
		public NodeTypeContext nodeType() {
			return getRuleContext(NodeTypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FreezeTagParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FreezeTagParser.WS, i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node);
		int _la;
		try {
			int _alt;
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_S) {
					{
					setState(47);
					nodeType();
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(48);
						match(WS);
						}
					}

					}
				}

				setState(53);
				nodeProperty();
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(54);
							match(WS);
							}
						}

						setState(57);
						nodeProperty();
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				nodeType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_S() { return getToken(FreezeTagParser.TYPE_S, 0); }
		public TerminalNode ID() { return getToken(FreezeTagParser.ID, 0); }
		public NodeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterNodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitNodeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitNodeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeTypeContext nodeType() throws RecognitionException {
		NodeTypeContext _localctx = new NodeTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nodeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(TYPE_S);
			setState(67);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePropertyContext extends ParserRuleContext {
		public TerminalNode PROP_S() { return getToken(FreezeTagParser.PROP_S, 0); }
		public TerminalNode ID() { return getToken(FreezeTagParser.ID, 0); }
		public TerminalNode WS() { return getToken(FreezeTagParser.WS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NodePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterNodeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitNodeProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitNodeProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePropertyContext nodeProperty() throws RecognitionException {
		NodePropertyContext _localctx = new NodePropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodeProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PROP_S);
			setState(70);
			match(ID);
			setState(71);
			match(WS);
			setState(72);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode PROP_S() { return getToken(FreezeTagParser.PROP_S, 0); }
		public TerminalNode ID() { return getToken(FreezeTagParser.ID, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PROP_S);
			setState(75);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FreezeTagParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FreezeTagParser.ID, i);
		}
		public List<TerminalNode> WS() { return getTokens(FreezeTagParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FreezeTagParser.WS, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FreezeTagListener ) ((FreezeTagListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FreezeTagVisitor ) return ((FreezeTagVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\3\5\3\36\n\3\3\3\3\3\5\3\"\n\3\3\3\5\3"+
		"%\n\3\3\3\5\3(\n\3\3\4\3\4\3\5\3\5\5\5.\n\5\3\5\3\5\3\6\3\6\5\6\64\n\6"+
		"\5\6\66\n\6\3\6\3\6\5\6:\n\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\5\6C\n\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\6\nQ\n\n\r\n\16\nR\3"+
		"\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\6\7W\2\24\3\2\2\2\4\35\3\2\2\2"+
		"\6)\3\2\2\2\b+\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16G\3\2\2\2\20L\3\2\2\2\22"+
		"P\3\2\2\2\24\31\5\4\3\2\25\26\7\3\2\2\26\30\5\4\3\2\27\25\3\2\2\2\30\33"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34\36"+
		"\7\7\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37$\5\6\4\2 \"\7\7"+
		"\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#%\5\b\5\2$!\3\2\2\2$%\3\2\2\2%\'"+
		"\3\2\2\2&(\7\7\2\2\'&\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)*\5\n\6\2*\7\3\2\2"+
		"\2+-\5\20\t\2,.\7\7\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\5\n\6\2\60\t"+
		"\3\2\2\2\61\63\5\f\7\2\62\64\7\7\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66"+
		"\3\2\2\2\65\61\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67>\5\16\b\28:\7\7"+
		"\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\5\16\b\2<9\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?C\3\2\2\2@>\3\2\2\2AC\5\f\7\2B\65\3\2\2\2BA\3\2\2\2C"+
		"\13\3\2\2\2DE\7\4\2\2EF\7\6\2\2F\r\3\2\2\2GH\7\5\2\2HI\7\6\2\2IJ\7\7\2"+
		"\2JK\5\22\n\2K\17\3\2\2\2LM\7\5\2\2MN\7\6\2\2N\21\3\2\2\2OQ\t\2\2\2PO"+
		"\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\23\3\2\2\2\16\31\35!$\'-\63\65"+
		"9>BR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}