package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 臻晨测试专用，他人勿动
 *
 * @author auto create
 * @since 1.0, 2024-01-29 14:10:00
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7641688733669655561L;

	/**
	 * 详细地址
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * 1
	 */
	@ApiField("a_uid")
	private String aUid;

	/**
	 * lalala
	 */
	@ApiListField("aa")
	@ApiField("string")
	private List<String> aa;

	/**
	 * 1
	 */
	@ApiField("aaaaa")
	private String aaaaa;

	/**
	 * 1
	 */
	@ApiField("aaaaa_open_id")
	private String aaaaaOpenId;

	/**
	 * 1
	 */
	@ApiField("ab")
	private Date ab;

	/**
	 * 1
	 */
	@ApiField("ac")
	private String ac;

	/**
	 * 1
	 */
	@ApiField("ad")
	private Long ad;

	/**
	 * 1
	 */
	@ApiField("ae")
	private Boolean ae;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 1
	 */
	@ApiField("d")
	private String d;

	/**
	 * 1
	 */
	@ApiField("data")
	private Date data;

	/**
	 * 1 当前字段已废弃(1234567891011121314151617182)
	 */
	@ApiField("e")
	@Deprecated
	private Boolean e;

	/**
	 * 1 当前字段已废弃(111111111111)
	 */
	@ApiField("g")
	@Deprecated
	private AAAAAtest g;

	/**
	 * 1
	 */
	@ApiListField("i")
	@ApiField("string")
	private List<String> i;

	/**
	 * 1
	 */
	@ApiField("mn")
	private AAAAAtest mn;

	/**
	 * 详细地址
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1
	 */
	@ApiField("s")
	private ManjiangTestComplexOneData s;

	/**
	 * 1
	 */
	@ApiField("sss")
	private String sss;

	/**
	 * 1
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 1
	 */
	@ApiField("uid_2_open_id")
	private String uid2OpenId;

	/**
	 * 1
	 */
	@ApiField("uid_open_id")
	private String uidOpenId;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public String getaUid() {
		return this.aUid;
	}
	public void setaUid(String aUid) {
		this.aUid = aUid;
	}

	public List<String> getAa() {
		return this.aa;
	}
	public void setAa(List<String> aa) {
		this.aa = aa;
	}

	public String getAaaaa() {
		return this.aaaaa;
	}
	public void setAaaaa(String aaaaa) {
		this.aaaaa = aaaaa;
	}

	public String getAaaaaOpenId() {
		return this.aaaaaOpenId;
	}
	public void setAaaaaOpenId(String aaaaaOpenId) {
		this.aaaaaOpenId = aaaaaOpenId;
	}

	public Date getAb() {
		return this.ab;
	}
	public void setAb(Date ab) {
		this.ab = ab;
	}

	public String getAc() {
		return this.ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}

	public Long getAd() {
		return this.ad;
	}
	public void setAd(Long ad) {
		this.ad = ad;
	}

	public Boolean getAe() {
		return this.ae;
	}
	public void setAe(Boolean ae) {
		this.ae = ae;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return this.d;
	}
	public void setD(String d) {
		this.d = d;
	}

	public Date getData() {
		return this.data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public Boolean getE() {
		return this.e;
	}
	public void setE(Boolean e) {
		this.e = e;
	}

	public AAAAAtest getG() {
		return this.g;
	}
	public void setG(AAAAAtest g) {
		this.g = g;
	}

	public List<String> getI() {
		return this.i;
	}
	public void setI(List<String> i) {
		this.i = i;
	}

	public AAAAAtest getMn() {
		return this.mn;
	}
	public void setMn(AAAAAtest mn) {
		this.mn = mn;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public ManjiangTestComplexOneData getS() {
		return this.s;
	}
	public void setS(ManjiangTestComplexOneData s) {
		this.s = s;
	}

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid2OpenId() {
		return this.uid2OpenId;
	}
	public void setUid2OpenId(String uid2OpenId) {
		this.uid2OpenId = uid2OpenId;
	}

	public String getUidOpenId() {
		return this.uidOpenId;
	}
	public void setUidOpenId(String uidOpenId) {
		this.uidOpenId = uidOpenId;
	}

}
