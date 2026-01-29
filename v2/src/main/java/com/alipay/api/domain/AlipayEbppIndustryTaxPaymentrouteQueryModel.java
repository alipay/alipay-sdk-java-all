package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银联缴税路由查询
 *
 * @author auto create
 * @since 1.0, 2024-06-12 19:32:26
 */
public class AlipayEbppIndustryTaxPaymentrouteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4864642488933537831L;

	/**
	 * v=1
01、02个税
21 社保缴税
31、32、33 非税
41 行邮税

v=2*
03 缴税金4
U1 税费合并
41 行邮税
51、52 社保缴费
61、62 非税
	 */
	@ApiField("bt")
	private String bt;

	/**
	 * 11:北京市
12:天津市
13:河北省
14:山西省
15:内蒙古自治区
21:辽宁省
22:吉林省
23:黑龙江省
31:上海市
32:江苏省
33:浙江省
34:安徽省
35:福建省
36:江西省
37:山东省
41:河南省
42:湖北省
43:湖南省
44:广东省
45:广西壮族自治区
46:海南省
50:重庆市
51:四川省
52:贵州省
53:云南省
54:西藏自治区
61:陕西省
62:甘肃省
63:青海省
64:宁夏回族自治区
65:新疆维吾尔自治区
91:大连市
92:宁波市
93:厦门市
94:青岛市
95:深圳市
88:其它地区
00:全国
	 */
	@ApiField("ck")
	private String ck;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求来源，由支付宝开发分配提供
	 */
	@ApiField("source")
	private String source;

	/**
	 * 金额 元
	 */
	@ApiField("txn_amt")
	private String txnAmt;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 缴税tips版本号
1 2 2.0 2.1 2.2
	 */
	@ApiField("v")
	private String v;

	public String getBt() {
		return this.bt;
	}
	public void setBt(String bt) {
		this.bt = bt;
	}

	public String getCk() {
		return this.ck;
	}
	public void setCk(String ck) {
		this.ck = ck;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTxnAmt() {
		return this.txnAmt;
	}
	public void setTxnAmt(String txnAmt) {
		this.txnAmt = txnAmt;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getV() {
		return this.v;
	}
	public void setV(String v) {
		this.v = v;
	}

}
