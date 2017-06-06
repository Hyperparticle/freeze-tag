// Generated from /home/hyper/Documents/drive/code/projects/freeze-tag/src/main/antlr/FreezeTag.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			statement();
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(19);
					match(SEP_S);
					setState(20);
					statement();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEP_S) {
				{
				setState(26);
				match(SEP_S);
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(29);
				match(WS);
				}
			}

			setState(32);
			subject();
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(33);
					match(WS);
					}
				}

				setState(36);
				predicate();
				}
				break;
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(39);
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
			setState(42);
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
			setState(44);
			relation();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(45);
				match(WS);
				}
			}

			setState(48);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_S) {
					{
					setState(50);
					nodeType();
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(51);
						match(WS);
						}
					}

					}
				}

				setState(56);
				nodeProperty();
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(57);
							match(WS);
							}
						}

						setState(60);
						nodeProperty();
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(69);
			match(TYPE_S);
			setState(70);
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
			setState(72);
			match(PROP_S);
			setState(73);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(74);
				match(WS);
				setState(75);
				string();
				}
				break;
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
			setState(78);
			match(PROP_S);
			setState(79);
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
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81);
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
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\2\5\2\36\n\2\3\3\5\3!\n\3\3\3\3\3\5\3%"+
		"\n\3\3\3\5\3(\n\3\3\3\5\3+\n\3\3\4\3\4\3\5\3\5\5\5\61\n\5\3\5\3\5\3\6"+
		"\3\6\5\6\67\n\6\5\69\n\6\3\6\3\6\5\6=\n\6\3\6\7\6@\n\6\f\6\16\6C\13\6"+
		"\3\6\5\6F\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\3\n\6\n"+
		"U\n\n\r\n\16\nV\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\6\7\2]\2\24\3"+
		"\2\2\2\4 \3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16J\3\2"+
		"\2\2\20P\3\2\2\2\22T\3\2\2\2\24\31\5\4\3\2\25\26\7\3\2\2\26\30\5\4\3\2"+
		"\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\35\3\2\2\2"+
		"\33\31\3\2\2\2\34\36\7\3\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2"+
		"\37!\7\7\2\2 \37\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"\'\5\6\4\2#%\7\7\2\2$#"+
		"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&(\5\b\5\2\'$\3\2\2\2\'(\3\2\2\2(*\3\2\2\2"+
		")+\7\7\2\2*)\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,-\5\n\6\2-\7\3\2\2\2.\60\5\20"+
		"\t\2/\61\7\7\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\5\n\6\2"+
		"\63\t\3\2\2\2\64\66\5\f\7\2\65\67\7\7\2\2\66\65\3\2\2\2\66\67\3\2\2\2"+
		"\679\3\2\2\28\64\3\2\2\289\3\2\2\29:\3\2\2\2:A\5\16\b\2;=\7\7\2\2<;\3"+
		"\2\2\2<=\3\2\2\2=>\3\2\2\2>@\5\16\b\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB"+
		"\3\2\2\2BF\3\2\2\2CA\3\2\2\2DF\5\f\7\2E8\3\2\2\2ED\3\2\2\2F\13\3\2\2\2"+
		"GH\7\4\2\2HI\7\6\2\2I\r\3\2\2\2JK\7\5\2\2KN\7\6\2\2LM\7\7\2\2MO\5\22\n"+
		"\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PQ\7\5\2\2QR\7\6\2\2R\21\3\2\2\2SU\t"+
		"\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\23\3\2\2\2\20\31\35 $"+
		"\'*\60\668<AENV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}