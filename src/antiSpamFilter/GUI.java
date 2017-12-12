package antiSpamFilter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class GUI {

	private Object [][] dados = {{"BAYES_00", " "}, {"FREEMAIL_FROM", " "}, {"RDNS_NONE", " "}, {"FREEMAIL_REPLYTO_END_DIGIT", " "}, {"MSOE_MID_WRONG_CASE", " "},
			{"DATE_IN_PAST_24_48", " "}, {"T_LOTS_OF_MONEY", " "}, {"SPF_HELO_FAIL", " "}, {"ALL_TRUSTED", " "}, {"DNS_FROM_RFC_DSN", " "}, {"DATE_IN_PAST_06_12", " "},
			{"HTML_IMAGE_RATIO_04", " "}, {"HTML_MESSAGE", " "}, {"NO_DNS_FOR_FROM", " "}, {"URIBL_GREY", " "}, {"PLING_QUERY", " "}, {"HTTP_ESCAPED_HOST", " "},
			{"MIME_HEADER_CTYPE_ONLY", " "}, {"MIME_HTML_ONLY", " "}, {"NORMAL_HTTP_TO_IP", " "}, {"DATE_IN_PAST_03_06", " "}, {"HK_NAME_DRUGS", " "},
			{"HS_INDEX_PARAM", " "}, {"LOW_PRICE", " "}, {"SPF_SOFTFAIL", " "}, {"MSGID_FROM_MTA_HEADER", " "}, {"RCVD_IN_DNSWL_LOW", " "}, {"MISSING_HEADERS", " "},
			{"NO_RECEIVED", " "}, {"NO_RELAYS", " "}, {"RCVD_IN_NJABL_PROXY", " "}, {"BAYES_05", " "}, {"SPF_FAIL", " "}, {"SUBJECT_NEEDS_ENCODING", " "},
			{"HTML_FONT_FACE_BAD", " "}, {"RCVD_IN_DNSWL_MED", " "}, {"TVD_SPACE_RATIO", " "}, {"SUBJ_DOLLARS", " "}, {"FROM_LOCAL_NOVOWEL", " "},
			{"MIME_QP_LONG_LINE", " "}, {"APOSTROPHE_FROM", " "}, {"RCVD_IN_DNSWL_HI", " "}, {"RCVD_NUMERIC_HELO", " "}, {"HTML_TAG_BALANCE_BODY", " "},
			{"RDNS_DYNAMIC", " "}, {"URIBL_SBL", " "}, {"ACT_NOW_CAPS", " "}, {"BAYES_50", " "}, {"DEAR_EMAIL", " "}, {"DRUGS_ANXIETY", " "},
			{"ENV_AND_HDR_SPF_MATCH", " "}, {"SPF_PASS", " "}, {"URI_HEX", " "}, {"USER_IN_DEF_SPF_WL", " "}, {"SPF_HELO_SOFTFAIL", " "}, {"DATE_IN_PAST_12_24", " "},
			{"RCVD_IN_DNSWL_NONE", " "}, {"FH_HOST_EQ_PACBELL_D", " "}, {"MSGID_SPAM_CAPS", " "}, {"SUBJECT_DRUG_GAP_C", " "}, {"HTML_IMAGE_RATIO_02", " "},
			{"URG_BIZ", " "}, {"FS_START_DOYOU2", " "}, {"XMAILER_MIMEOLE_OL_3AC1D", " "}, {"DATE_IN_FUTURE_12_24", " "}, {"MSGID_RANDY", " "}, {"FREEMAIL_REPLY", " "},
			{"FROM_LOCAL_DIGITS", " "}, {"FROM_LOCAL_HEX", " "}, {"HTTP_EXCESSIVE_ESCAPES", " "}, {"FAKE_REPLY_C", " "}, {"SPF_NEUTRAL", " "},
			{"T_FILL_THIS_FORM_SHORT", " "}, {"BODY_ENHANCEMENT", " "}, {"HK_RANDOM_ENVFROM", " "}, {"MISSING_SUBJECT", " "}, {"SUBJ_BUY", " "},
			{"HTML_TAG_BALANCE_HEAD", " "}, {"MISSING_MIMEOLE", " "}, {"MPART_ALT_DIFF", " "}, {"BASE64_LENGTH_78_79", " "}, {"DIET_1", " "}, {"SUBJ_ALL_CAPS", " "},
			{"TO_NO_BRKTS_DYNIP", " "}, {"BAYES_20", " "}, {"HTML_IMAGE_RATIO_08", " "}, {"HTML_COMMENT_SAVED_URL", " "}, {"WEIRD_PORT", " "}, {"BAYES_40", " "},
			{"MARKETING_PARTNERS", " "}, {"HTML_EMBEDS", " "}, {"HTML_IMAGE_ONLY_28", " "}, {"FRT_ADOBE2", " "}, {"RCVD_IN_NJABL_SPAM", " "},
	        {"ANY_BOUNCE_MESSAGE", " "}, {"VBOUNCE_MESSAGE", " "}, {"RCVD_IN_RP_RNBL", " "}, {"DRUGS_ERECTILE", " "}, {"UNPARSEABLE_RELAY", " "},
	        {"RCVD_IN_SORBS_DUL", " "}, {"FSL_HELO_NON_FQDN_1", " "}, {"HELO_NO_DOMAIN", " "}, {"INVALID_MSGID", " "}, {"HTML_IMAGE_RATIO_06", " "},
	        {"DATE_IN_FUTURE_03_06", " "}, {"FU_COMMON_SUBS2", " "}, {"SPOOF_COM2COM", " "}, {"MIME_HTML_MOSTLY", " "}, {"SPF_HELO_PASS", " "},
	        {"DATE_IN_FUTURE_06_12", " "}, {"TVD_APPROVED", " "}, {"DEAR_SOMETHING", " "}, {"T_FROM_MISSPACED", " "}, {"EXTRA_MPART_TYPE", " "},
	        {"TVD_FW_GRAPHIC_NAME_LONG", " "}, {"TVD_FW_GRAPHIC_NAME_MID", " "}, {"MONEY_FROM_MISSP", " "}, {"FRT_SOMA2", " "}, {"TVD_SUBJ_ACC_NUM", " "},
	        {"RCVD_IN_PBL", " "}, {"BODY_ENHANCEMENT2", " "}, {"FRT_SOMA", " "}, {"MONEY_BACK", " "}, {"FRT_BIGGERMEM1", " "}, {"BAYES_60", " "}, {"CTYPE_001C_B", " "},
	        {"USER_IN_DEF_WHITELIST", " "}, {"RATWARE_MS_HASH", " "}, {"FUZZY_VPILL", " "}, {"FREEMAIL_REPLYTO", " "}, {"UPPERCASE_50_75", " "},
	        {"HTML_FONT_SIZE_LARGE", " "}, {"DATE_IN_FUTURE_96_XX", " "}, {"BAYES_99", " "}, {"FORGED_HOTMAIL_RCVD2", " "}, {"RCVD_IN_BRBL_LASTEXT"," "},
	        {"HTML_IMAGE_ONLY_16", " "}, {"MIME_BASE64_TEXT", " "}, {"HTML_IMAGE_ONLY_24", " "}, {"BAD_CREDIT", " "}, {"BUG6152_INVALID_DATE_TZ_ABSURD", " "},
	        {"INVALID_DATE_TZ_ABSURD", " "}, {"MSGID_OUTLOOK_INVALID", " "}, {"NO_RDNS_DOTCOM_HELO", " "}, {"HTML_IMAGE_ONLY_20", " "}, {"HTML_SHORT_LINK_IMG_3", " "},
	        {"IP_LINK_PLUS", " "}, {"RATWARE_OUTLOOK_NONAME", " "}, {"FORGED_MUA_MOZILLA", " "}, {"INVALID_DATE", " "}, {"NA_DOLLARS", " "}, {"RCVD_FAKE_HELO_DOTCOM", " "},
	        {"FORGED_MUA_OUTLOOK", " "}, {"FROM_ILLEGAL_CHARS", " "}, {"HTML_FONT_LOW_CONTRAST", " "}, {"HTML_OBFUSCATE_05_10", " "}, {"MIME_HTML_ONLY_MULTI", " "},
	        {"MSGID_SHORT", " "}, {"FORGED_YAHOO_RCVD", " "}, {"HTML_IMAGE_ONLY_04", " "}, {"HTML_SHORT_LINK_IMG_1", " "}, {"BANG_GUAR", " "},
	        {"GUARANTEED_100_PERCENT", " "}, {"FIN_FREE", " "}, {"DOS_OE_TO_MX", " "}, {"FORGED_OUTLOOK_HTML", " "}, {"FSL_HELO_BARE_IP_1", " "},
	        {"RCVD_HELO_IP_MISMATCH", " "}, {"TWO_IPS_RCVD", " "}, {"DNS_FROM_RFC_BOGUSMX", " "}, {"FB_NO_SCRIP_NEEDED", " "}, {"FORGED_OUTLOOK_TAGS", " "},
	        {"FREEMAIL_ENVFROM_END_DIGIT", " "}, {"HTML_MIME_NO_HTML_TAG", " "}, {"HTML_SHORT_LINK_IMG_2", " "}, {"NO_PRESCRIPTION", " "}, {"RCVD_IN_SBL", " "},
	        {"ENGLISH_UCE_SUBJECT", " "}, {"FREE_QUOTE_INSTANT", " "}, {"HTML_IMAGE_ONLY_12", " "}, {"HIDE_WIN_STATUS", " "}, {"OBFUSCATING_COMMENT", " "},
	        {"SUSPICIOUS_RECIPS", " "}, {"ADVANCE_FEE_2", " "}, {"FORGED_MUA_IMS", " "}, {"HTML_EXTRA_CLOSE", " "}, {"SUBJECT_DIET", " "}, {"EXCUSE_REMOVE", " "},
	        {"FREEMAIL_FORGED_REPLYTO", " "}, {"EXCUSE_24", " "}, {"TRACKER_ID", " "}, {"SUBJ_ILLEGAL_CHARS", " "}, {"FILL_THIS_FORM_LOAN", " "}, {"T_FILL_THIS_FORM", " "},
	        {"HTML_FONT_SIZE_HUGE", " "}, {"DATE_IN_FUTURE_24_48", " "}, {"FORGED_MUA_EUDORA", " "}, {"RATWARE_EGROUPS", " "}, {"EXCUSE_4", " "}, {"FUZZY_CREDIT", " "},
	        {"HTML_IMAGE_ONLY_08", " "}, {"URIBL_DBL_SPAM", " "}, {"FM_SUBJ_APPROVE", " "}, {"MIME_BASE64_BLANKS", " "}, {"WEIRD_QUOTING", " "},
	        {"DATE_IN_PAST_96_XX", " "}, {"FROM_OFFERS", " "}, {"ADVANCE_FEE_3", " "}, {"ADVANCE_FEE_4", " "}, {"DEAR_FRIEND", " "}, {"MILLION_USD", " "},
	        {"UPPERCASE_75_100", " "}, {"US_DOLLARS_3", " "}, {"TVD_SUBJ_WIPE_DEBT", " "}, {"BAYES_95", " "}, {"DOS_OUTLOOK_TO_MX", " "}, {"SPF_HELO_NEUTRAL", " "},
	        {"FH_DATE_IS_19XX", " "}, {"BAYES_80", " "}, {"FROM_MISSP_FREEMAIL", " "}, {"FH_FROM_CASH", " "}, {"LOCALPART_IN_SUBJECT", " "}, {"UNCLAIMED_MONEY", " "},
	        {"HTML_TITLE_SUBJ_DIFF", " "}, {"HK_NAME_FREE", " "}, {"REPTO_QUOTE_YAHOO", " "}, {"TO_MALFORMED", " "}, {"MPART_ALT_DIFF_COUNT", " "}, {"FR_TITLE_NUMS", " "},
	        {"FILL_THIS_FORM_LONG", " "}, {"FS_LARGE_PERCENT2", " "}, {"REPLYTO_WITHOUT_TO_CC", " "}, {"FORGED_TELESP_RCVD", " "}, {"DYN_RDNS_SHORT_HELO_HTML", " "},
	        {"DOS_OE_TO_MX_IMAGE", " "}, {"PART_CID_STOCK_LESS", " "}, {"FS_WEIGHT_LOSS", " "}, {"GAPPY_SUBJECT", " "}, {"FS_START_LOSE", " "}, {"FB_INCREASE_YOUR", " "},
	        {"MORE_SEX", " "}, {"DRUG_ED_CAPS", " "}, {"DRUG_ED_ONLINE", " "}, {"MISSING_MIME_HB_SEP", " "}, {"T_MIME_NO_TEXT", " "}, {"URIBL_JP_SURBL", " "},
	        {"SHORT_TERM_PRICE", " "}, {"FH_FROMEML_NOTLD", " "}, {"FROM_NO_USER", " "}, {"TVD_INCREASE_SIZE", " "}, {"HK_SCAM_N2", " "}, {"TVD_PH_SUBJ_URGENT", " "},
	        {"FORGED_MUA_OIMO", " "}, {"FUZZY_MILLION", " "}, {"HELO_OEM", " "}, {"URIBL_WS_SURBL", " "}, {"DRUGS_DIET", " "}, {"FB_GVR", " "}, {"HEADER_SPAM", " "},
	        {"FAKE_HELO_MAIL_COM_DOM", " "}, {"IMPOTENCE", " "}, {"HTML_IMAGE_ONLY_32", " "}, {"ONE_TIME", " "}, {"RCVD_ILLEGAL_IP", " "}, {"FS_REPLICA", " "},
	        {"FROM_EXCESS_BASE64", " "}, {"DOS_HIGHBIT_HDRS_BODY", " "}, {"NUMERIC_HTTP_ADDR", " "}, {"URIBL_BLACK", " "}, {"FILL_THIS_FORM_FRAUD_PHISH", " "},
	        {"FORGED_MSGID_YAHOO", " "}, {"FROM_STARTS_WITH_NUMS", " "}, {"SUBJ_YOUR_DEBT", " "}, {"RCVD_IN_IADB_DOPTIN_LT50", " "}, {"RCVD_IN_IADB_LISTED", " "},
	        {"RCVD_IN_NJABL_RELAY", " "}, {"ONLINE_PHARMACY", " "}, {"TVD_VISIT_PHARMA", " "}, {"FB_SAVE_PERSC", " "}, {"FORGED_MUA_THEBAT_BOUN", " "},
	        {"FB_LOSE_WEIGHT_CAP", " "}, {"RCVD_DOUBLE_IP_LOOSE", " "}, {"FB_SPACED_FREE", " "}, {"BASE64_LENGTH_79_INF", " "},  {"SHORT_HELO_AND_INLINE_IMAGE", " "},
	        {"FM_LOTTO_YOU_WON", " "}, {"SUBJ_AS_SEEN", " "}, {"DATE_IN_FUTURE_48_96", " "}, {"HTML_OBFUSCATE_10_20", " "}, {"FUZZY_XPILL", " "}, {"PERCENT_RANDOM", " "},
	        {"TVD_RCVD_SINGLE", " "}, {"FM_SCHOOLING", " "}, {"FM_SCHOOL_DIPLOMA", " "}, {"SORTED_RECIPS", " "}, {"FH_HOST_IN_ADDRARPA", " "}, {"FROM_BLANK_NAME", " "},
	        {"HTML_SHORT_CENTER", " "}, {"MISSING_DATE", " "}, {"MISSING_MID", " "}, {"NO_HEADERS_MESSAGE", " "}, {"MANY_SPAN_IN_TEXT", " "}, {"DYN_RDNS_AND_INLINE_IMAGE", " "},
	        {"TVD_RCVD_IP", " "}, {"TVD_RCVD_IP4", " "}, {"FROM_MISSP_MSFT", " "}, {"SUBJ_YOUR_FAMILY", " "}, {"FRT_DIPLOMA", " "}, {"BANKING_LAWS", " "}, {"RCVD_IN_SORBS_WEB", " "},
	        {"SANE_91eb43f705d25c804374a746d7519660", " "}, {"FH_HELO_EQ_D_D_D_D", " "}, {"HELO_DYNAMIC_DHCP", " "}, {"S25R_6", " "}, {"DRUG_ED_SILD", " "}, {"RATWARE_EFROM", " "},
	        {"FROM_MISSP_DYNIP", " "}, {"FH_FROM_GET_NAME", " "}, {"HTML_NONELEMENT_30_40", " "}, {"T_KHOP_FOREIGN_CLICK", " "}, {"FS_ABIGGER", " "}, {"UNRESOLVED_TEMPLATE", " "},
	        {"FUZZY_PHARMACY", " "}, {"FB_GET_MEDS", " "}, {"HK_LOTTO", " "}, {"KAM_LOTTO1", " "}, {"LOTTO_AGENT", " "}, {"URI_NOVOWEL", " "}, {"FS_NUDE", " "},
	        {"HELO_LOCALHOST", " "}, {"DRUGS_MUSCLE", " "}, {"MSGID_MULTIPLE_AT", " "}, {"BILLION_DOLLARS", " "}, {"TVD_PH_BODY_ACCOUNTS_PRE", " "}, {"FUZZY_PHENT", " "}
	    };
	
	private String [] colunas = {"Rules", "Weight [-5, 5]"};
	
	private JFrame frame;
	private JCheckBox checkBoxPathRules;
	private JCheckBox checkBoxPathHam;
	private JCheckBox checkBoxPathSpam;
	private JTable tableConfAuto;
	private JTable tableConfManual;
	private JTextField textFPConfAuto;
	private JTextField textFNConfAuto;
	private JTextField textFPConfManual;
	private JTextField textFNConfManual;
	
	private File fileRules = new File("rules.cf");
	private File fileHam = new File("ham.log");
	private File fileSpam = new File("spam.log");
	
	@SuppressWarnings("unused")
	private Reader r = null;
	
	public GUI() {
		addContentInterface();
		startInterface();
	}

	private void addContentInterface() {
		frame = new JFrame();
		frame.setSize(870, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel labelConfAuto = new JLabel("Configuração Automática");
		labelConfAuto.setBounds(165, 16, 184, 20);
		frame.getContentPane().add(labelConfAuto);
		
		JLabel labelConfManual = new JLabel("Configuração Manual");
		labelConfManual.setBounds(439, 16, 184, 20);
		frame.getContentPane().add(labelConfManual);
		
		JCheckBox checkBoxConfAuto = new JCheckBox("");
		checkBoxConfAuto.setBounds(590, 12, 29, 29);
		frame.getContentPane().add(checkBoxConfAuto);
		
		JCheckBox checkBoxConfManual = new JCheckBox("");
		checkBoxConfManual.setBounds(346, 12, 29, 29);
		frame.getContentPane().add(checkBoxConfManual);
		
		JLabel labelPathRules = new JLabel("Path rules.cf");
		labelPathRules.setBounds(145, 46, 98, 20);
		frame.getContentPane().add(labelPathRules);
		
		JLabel labelPathHam = new JLabel("Path ham.log");
		labelPathHam.setBounds(356, 46, 98, 20);
		frame.getContentPane().add(labelPathHam);
		
		JLabel labelPathSpam = new JLabel("Path Spam.log");
		labelPathSpam.setBounds(585, 46, 98, 20);
		frame.getContentPane().add(labelPathSpam);
		
		checkBoxPathRules = new JCheckBox("");
		checkBoxPathRules.setBounds(225, 42, 29, 29);
		frame.getContentPane().add(checkBoxPathRules);
		
		checkBoxPathHam = new JCheckBox("");
		checkBoxPathHam.setBounds(438, 42, 29, 29);
		frame.getContentPane().add(checkBoxPathHam);
		
		checkBoxPathSpam = new JCheckBox("");
		checkBoxPathSpam.setBounds(674, 42, 29, 29);
		frame.getContentPane().add(checkBoxPathSpam);
		
		JLabel labelConfAuto2 = new JLabel("Configuração Automática");
		labelConfAuto2.setBounds(128, 82, 184, 20);
		frame.getContentPane().add(labelConfAuto2);
		
		JLabel labelConfManual2 = new JLabel("Configuração Manual");
		labelConfManual2.setBounds(560, 82, 156, 20);
		frame.getContentPane().add(labelConfManual2);
		
		JScrollPane scrollPaneTableConfAuto = new JScrollPane();
		scrollPaneTableConfAuto.setBounds(55, 106, 313, 136);
		frame.getContentPane().add(scrollPaneTableConfAuto);
		
		tableConfAuto = new JTable(dados, colunas);
		scrollPaneTableConfAuto.setViewportView(tableConfAuto);
		
		JScrollPane scrollPaneTableConfManual = new JScrollPane();
		scrollPaneTableConfManual.setBounds(476, 106, 313, 136);
		frame.getContentPane().add(scrollPaneTableConfManual);
		
		tableConfManual = new JTable(dados, colunas);
		scrollPaneTableConfManual.setViewportView(tableConfManual);

		JLabel labelFPConfAuto = new JLabel("FP");
		labelFPConfAuto.setBounds(110, 258, 69, 20);
		frame.getContentPane().add(labelFPConfAuto);
		
		JLabel labelFNConfAuto = new JLabel("FN");
		labelFNConfAuto.setBounds(110, 294, 69, 20);
		frame.getContentPane().add(labelFNConfAuto);
		
		textFPConfAuto = new JTextField();
		textFPConfAuto.setBounds(145, 291, 146, 26);
		frame.getContentPane().add(textFPConfAuto);
		textFPConfAuto.setColumns(10);
		
		textFNConfAuto = new JTextField();
		textFNConfAuto.setBounds(145, 255, 146, 26);
		frame.getContentPane().add(textFNConfAuto);
		textFNConfAuto.setColumns(10);
		
		JLabel labelFPConfManual = new JLabel("FP");
		labelFPConfManual.setBounds(527, 258, 69, 20);
		frame.getContentPane().add(labelFPConfManual);
		
		JLabel labelFNConfManual = new JLabel("FN");
		labelFNConfManual.setBounds(527, 294, 69, 20);
		frame.getContentPane().add(labelFNConfManual);
		
		textFPConfManual = new JTextField();
		textFPConfManual.setColumns(10);
		textFPConfManual.setBounds(560, 255, 146, 26);
		frame.getContentPane().add(textFPConfManual);

		textFNConfManual = new JTextField();
		textFNConfManual.setColumns(10);
		textFNConfManual.setBounds(560, 291, 146, 26);
		frame.getContentPane().add(textFNConfManual);
		
		JButton buttonAvaliar = new JButton("AVALIAR");
		buttonAvaliar.setBounds(155, 330, 115, 29);
		frame.getContentPane().add(buttonAvaliar);
		
		buttonAvaliar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkedBox();
			}
		});
		
		JButton buttonGravarConfAuto = new JButton("GRAVAR");
		buttonGravarConfAuto.setBounds(155, 375, 115, 29);
		frame.getContentPane().add(buttonGravarConfAuto);
		
		JButton buttonGerarConfManual = new JButton("GERAR CONFIGURAÇÃO");
		buttonGerarConfManual.setBounds(508, 330, 221, 29);
		frame.getContentPane().add(buttonGerarConfManual);
		
		JButton buttonGravarConfManual = new JButton("GRAVAR");
		buttonGravarConfManual.setBounds(568, 375, 115, 29);
		frame.getContentPane().add(buttonGravarConfManual);
	}
	
	private void startInterface() {
		frame.setVisible(true);
	}
	
	private void checkedBox() {
		if (checkBoxPathRules.isSelected()) {
			//Reader r = new Reader(fileRules);
			r = new Reader(fileRules);
		}
		if (checkBoxPathHam.isSelected()) {
			//Reader r = new Reader(fileHam);
			r = new Reader(fileHam);
		}
		if (checkBoxPathSpam.isSelected()) {
			//Reader r = new Reader(fileSpam);
			r = new Reader(fileSpam);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		GUI g = new GUI();
	}
}
