/**
 * Copyright 1999-2016 Carsten Friedrich (Carsten.Friedrich@gmail.com)
 * Contributions by Falk Schreiber, Francois Bertault, Damian Merrick, and probably others
 * License: GNU GENERAL PUBLIC LICENSE 3.0 (https://www.gnu.org/copyleft/gpl.html)
 *
 */
/* Generated By:JavaCC: Do not edit this line. GraphedAttributeParserTokenManager.java */
package org.carsten.jjgraph.graph;

/**
 * GraphedAttributeParser.java
 *
 *
 * Created: Fri Feb 26 13:50:26 1999
 *
 * @author Carsten Friedrich
 * @version
 */

public class GraphedAttributeParserTokenManager implements GraphedAttributeParserConstants {
	public java.io.PrintStream debugStream = System.out;

	public void setDebugStream(final java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(final int pos, final long active0) {
		switch (pos) {
		case 0:
			if ((active0 & 0x90400L) != 0L) {
				jjmatchedKind = 20;
				return 25;
			}
			if ((active0 & 0x2c000L) != 0L) {
				jjmatchedKind = 20;
				return 22;
			}
			if ((active0 & 0x42000L) != 0L) {
				jjmatchedKind = 20;
				return 19;
			}
			return -1;
		case 1:
			if ((active0 & 0xc000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 1;
				return 21;
			}
			if ((active0 & 0x10000L) != 0L)
				return 25;
			if ((active0 & 0xa0400L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 1;
				return 25;
			}
			if ((active0 & 0x42000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 1;
				return 18;
			}
			return -1;
		case 2:
			if ((active0 & 0x4e000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 2;
				return 26;
			}
			if ((active0 & 0x80000L) != 0L)
				return 25;
			if ((active0 & 0x20400L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 2;
				return 25;
			}
			return -1;
		case 3:
			if ((active0 & 0x6e400L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 3;
				return 25;
			}
			return -1;
		case 4:
			if ((active0 & 0x2c000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 4;
				return 25;
			}
			if ((active0 & 0x42400L) != 0L)
				return 25;
			return -1;
		case 5:
			if ((active0 & 0x28000L) != 0L)
				return 25;
			if ((active0 & 0x4000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 5;
				return 25;
			}
			return -1;
		case 6:
			if ((active0 & 0x4000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 6;
				return 25;
			}
			return -1;
		case 7:
			if ((active0 & 0x4000L) != 0L) {
				jjmatchedKind = 20;
				jjmatchedPos = 7;
				return 25;
			}
			return -1;
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(final int pos, final long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private final int jjStopAtPos(final int pos, final int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private final int jjStartNfaWithStates_0(final int pos, final int kind, final int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	private final int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 36:
			return jjMoveStringLiteralDfa1_0(0x200L);
		case 59:
			return jjStopAtPos(0, 21);
		case 69:
			return jjMoveStringLiteralDfa1_0(0x80000L);
		case 70:
			return jjMoveStringLiteralDfa1_0(0x42000L);
		case 71:
			return jjMoveStringLiteralDfa1_0(0x400L);
		case 74:
			return jjMoveStringLiteralDfa1_0(0x2c000L);
		case 78:
			return jjMoveStringLiteralDfa1_0(0x10000L);
		case 123:
			return jjMoveStringLiteralDfa1_0(0x100L);
		default:
			return jjMoveNfa_0(2, 0);
		}
	}

	private final int jjMoveStringLiteralDfa1_0(final long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case 36:
			if ((active0 & 0x100L) != 0L)
				return jjStopAtPos(1, 8);
			break;
		case 67:
			return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
		case 70:
			return jjMoveStringLiteralDfa2_0(active0, 0x42000L);
		case 74:
			return jjMoveStringLiteralDfa2_0(active0, 0xc000L);
		case 78:
			return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
		case 80:
			if ((active0 & 0x10000L) != 0L)
				return jjStartNfaWithStates_0(1, 16, 25);
			break;
		case 82:
			return jjMoveStringLiteralDfa2_0(active0, 0x400L);
		case 125:
			if ((active0 & 0x200L) != 0L)
				return jjStopAtPos(1, 9);
			break;
		default:
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private final int jjMoveStringLiteralDfa2_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(0, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(1, active0);
			return 2;
		}
		switch (curChar) {
		case 65:
			return jjMoveStringLiteralDfa3_0(active0, 0x400L);
		case 68:
			if ((active0 & 0x80000L) != 0L)
				return jjStartNfaWithStates_0(2, 19, 25);
			break;
		case 79:
			return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
		case 95:
			return jjMoveStringLiteralDfa3_0(active0, 0x4e000L);
		default:
			break;
		}
		return jjStartNfa_0(1, active0);
	}

	private final int jjMoveStringLiteralDfa3_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(1, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(2, active0);
			return 3;
		}
		switch (curChar) {
		case 51:
			return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
		case 65:
			return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
		case 72:
			return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
		case 76:
			return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
		case 80:
			return jjMoveStringLiteralDfa4_0(active0, 0x400L);
		case 87:
			return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
		default:
			break;
		}
		return jjStartNfa_0(2, active0);
	}

	private final int jjMoveStringLiteralDfa4_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(2, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(3, active0);
			return 4;
		}
		switch (curChar) {
		case 68:
			if ((active0 & 0x2000L) != 0L)
				return jjStartNfaWithStates_0(4, 13, 25);
			break;
		case 69:
			if ((active0 & 0x40000L) != 0L)
				return jjStartNfaWithStates_0(4, 18, 25);
			break;
		case 72:
			if ((active0 & 0x400L) != 0L)
				return jjStartNfaWithStates_0(4, 10, 25);
			break;
		case 73:
			return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
		case 79:
			return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
		case 80:
			return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
		default:
			break;
		}
		return jjStartNfa_0(3, active0);
	}

	private final int jjMoveStringLiteralDfa5_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(3, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(4, active0);
			return 5;
		}
		switch (curChar) {
		case 68:
			return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
		case 80:
			if ((active0 & 0x8000L) != 0L)
				return jjStartNfaWithStates_0(5, 15, 25);
			break;
		case 82:
			if ((active0 & 0x20000L) != 0L)
				return jjStartNfaWithStates_0(5, 17, 25);
			break;
		default:
			break;
		}
		return jjStartNfa_0(4, active0);
	}

	private final int jjMoveStringLiteralDfa6_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(4, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(5, active0);
			return 6;
		}
		switch (curChar) {
		case 68:
			return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
		default:
			break;
		}
		return jjStartNfa_0(5, active0);
	}

	private final int jjMoveStringLiteralDfa7_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(5, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(6, active0);
			return 7;
		}
		switch (curChar) {
		case 69:
			return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
		default:
			break;
		}
		return jjStartNfa_0(6, active0);
	}

	private final int jjMoveStringLiteralDfa8_0(final long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(6, old0);
		try {
			curChar = input_stream.readChar();
		} catch (final java.io.IOException e) {
			jjStopStringLiteralDfa_0(7, active0);
			return 8;
		}
		switch (curChar) {
		case 78:
			if ((active0 & 0x4000L) != 0L)
				return jjStartNfaWithStates_0(8, 14, 25);
			break;
		default:
			break;
		}
		return jjStartNfa_0(7, active0);
	}

	private final void jjCheckNAdd(final int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private final void jjAddStates(int start, final int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private final void jjCheckNAddTwoStates(final int state1, final int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private final void jjCheckNAddStates(int start, final int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

	private final void jjCheckNAddStates(final int start) {
		jjCheckNAdd(jjnextStates[start]);
		jjCheckNAdd(jjnextStates[start + 1]);
	}

	static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL };

	@SuppressWarnings("unused")
	private final int jjMoveNfa_0(final int startState, int curPos) {
		final int[] nextStates;
		int startsAt = 0;
		jjnewStateCnt = 26;
		int i = 1;
		jjstateSet[0] = startState;
		final int j;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				final long l = 1L << curChar;
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 22:
					case 25:
						if ((0x3ff400000000000L & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					case 21:
						if ((0x3ff400000000000L & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					case 2:
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 6)
								kind = 6;
							jjCheckNAddTwoStates(0, 1);
						} else if (curChar == 46) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						} else if (curChar == 34)
							jjCheckNAddStates(0, 2);
						else if (curChar == 45)
							jjCheckNAdd(1);
						break;
					case 19:
						if ((0x3ff400000000000L & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					case 18:
						if ((0x3ff400000000000L & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					case 26:
						if ((0x3ff400000000000L & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					case 0:
						if (curChar == 45)
							jjCheckNAdd(1);
						break;
					case 1:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 6)
							kind = 6;
						jjCheckNAddTwoStates(0, 1);
						break;
					case 3:
						if ((0xfffffffbffffffffL & l) != 0L)
							jjCheckNAddStates(0, 2);
						break;
					case 4:
						if (curChar == 34)
							jjCheckNAddStates(0, 2);
						break;
					case 6:
						if (curChar == 34 && kind > 7)
							kind = 7;
						break;
					case 24:
						if (curChar != 46)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				final long l = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 22:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						}
						if (curChar == 74)
							jjstateSet[jjnewStateCnt++] = 21;
						break;
					case 21:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						}
						if (curChar == 95)
							jjCheckNAdd(17);
						break;
					case 2:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						}
						if (curChar == 74)
							jjstateSet[jjnewStateCnt++] = 22;
						else if (curChar == 70)
							jjstateSet[jjnewStateCnt++] = 19;
						else if (curChar == 68)
							jjstateSet[jjnewStateCnt++] = 14;
						else if (curChar == 85)
							jjstateSet[jjnewStateCnt++] = 7;
						break;
					case 19:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						}
						if (curChar == 70)
							jjstateSet[jjnewStateCnt++] = 18;
						break;
					case 18:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						}
						if (curChar == 95)
							jjCheckNAdd(17);
						break;
					case 26:
						if ((0x7fffffe87fffffeL & l) != 0L) {
							if (kind > 20)
								kind = 20;
							jjCheckNAdd(25);
						}
						if (curChar == 67) {
							if (kind > 12)
								kind = 12;
						}
						break;
					case 3:
						jjAddStates(0, 2);
						break;
					case 5:
						if (curChar == 92)
							jjstateSet[jjnewStateCnt++] = 4;
						break;
					case 7:
						if (curChar == 78)
							jjstateSet[jjnewStateCnt++] = 15;
						break;
					case 8:
						if (curChar == 68 && kind > 11)
							kind = 11;
						break;
					case 9:
						if (curChar == 69)
							jjstateSet[jjnewStateCnt++] = 8;
						break;
					case 10:
						if (curChar == 84)
							jjstateSet[jjnewStateCnt++] = 9;
						break;
					case 11:
						if (curChar == 67)
							jjstateSet[jjnewStateCnt++] = 10;
						break;
					case 12:
						if (curChar == 69)
							jjstateSet[jjnewStateCnt++] = 11;
						break;
					case 13:
						if (curChar == 82)
							jjstateSet[jjnewStateCnt++] = 12;
						break;
					case 14:
						if (curChar == 73)
							jjstateSet[jjnewStateCnt++] = 13;
						break;
					case 15:
						if (curChar == 68)
							jjstateSet[jjnewStateCnt++] = 14;
						break;
					case 16:
						if (curChar == 85)
							jjstateSet[jjnewStateCnt++] = 7;
						break;
					case 17:
						if (curChar == 67 && kind > 12)
							kind = 12;
						break;
					case 20:
						if (curChar == 70)
							jjstateSet[jjnewStateCnt++] = 19;
						break;
					case 23:
						if (curChar == 74)
							jjstateSet[jjnewStateCnt++] = 22;
						break;
					case 24:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					case 25:
						if ((0x7fffffe87fffffeL & l) == 0L)
							break;
						if (kind > 20)
							kind = 20;
						jjCheckNAdd(25);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				final int i2 = (curChar & 0xff) >> 6;
				final long l2 = 1L << (curChar & 077);
				MatchLoop: do {
					switch (jjstateSet[--i]) {
					case 3:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjAddStates(0, 2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 26 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (final java.io.IOException e) {
				return curPos;
			}
		}
	}

	static final int[] jjnextStates = { 3, 5, 6, };
	public static final String[] jjstrLiteralImages = { "", null, null, null, null, null, null, null, "\173\44",
			"\44\175", "\107\122\101\120\110", null, null, "\106\106\137\63\104",
			"\112\112\137\110\111\104\104\105\116", "\112\112\137\101\120\120", "\116\120", "\112\103\117\114\117\122",
			"\106\106\137\127\105", "\105\116\104", null, "\73", };
	public static final String[] lexStateNames = { "DEFAULT", };
	static final long[] jjtoToken = { 0x3fffc1L, };
	static final long[] jjtoSkip = { 0x3eL, };
	private SimpleCharStream input_stream;
	private final int[] jjrounds = new int[26];
	private final int[] jjstateSet = new int[52];
	protected char curChar;

	public GraphedAttributeParserTokenManager(final SimpleCharStream stream) {
		if (SimpleCharStream.staticFlag)
			throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		input_stream = stream;
	}

	public GraphedAttributeParserTokenManager(final SimpleCharStream stream, final int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	public void ReInit(final SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private final void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 26; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}

	public void ReInit(final SimpleCharStream stream, final int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	public void SwitchTo(final int lexState) {
		if (lexState >= 1 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		else
			curLexState = lexState;
	}

	private final Token jjFillToken() {
		final Token t = Token.newToken(jjmatchedKind);
		t.kind = jjmatchedKind;
		final String im = jjstrLiteralImages[jjmatchedKind];
		t.image = (im == null) ? input_stream.GetImage() : im;
		t.beginLine = input_stream.getBeginLine();
		t.beginColumn = input_stream.getBeginColumn();
		t.endLine = input_stream.getEndLine();
		t.endColumn = input_stream.getEndColumn();
		return t;
	}

	int curLexState = 0;
	int defaultLexState = 0;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;

	public final Token getNextToken() {
		final int kind;
		final Token specialToken = null;
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (final java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				return matchedToken;
			}

			try {
				input_stream.backup(0);
				while (curChar <= 61 && (0x2000000100002600L & (1L << curChar)) != 0L)
					curChar = input_stream.BeginToken();
			} catch (final java.io.IOException e1) {
				continue EOFLoop;
			}
			jjmatchedKind = 0x7fffffff;
			jjmatchedPos = 0;
			curPos = jjMoveStringLiteralDfa0_0();
			if (jjmatchedKind != 0x7fffffff) {
				if (jjmatchedPos + 1 < curPos)
					input_stream.backup(curPos - jjmatchedPos - 1);
				if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
					matchedToken = jjFillToken();
					return matchedToken;
				} else {
					continue EOFLoop;
				}
			}
			int error_line = input_stream.getEndLine();
			int error_column = input_stream.getEndColumn();
			String error_after = null;
			boolean EOFSeen = false;
			try {
				input_stream.readChar();
				input_stream.backup(1);
			} catch (final java.io.IOException e1) {
				EOFSeen = true;
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
				if (curChar == '\n' || curChar == '\r') {
					error_line++;
					error_column = 0;
				} else
					error_column++;
			}
			if (!EOFSeen) {
				input_stream.backup(1);
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
			}
			throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar,
					TokenMgrError.LEXICAL_ERROR);
		}
	}

}
