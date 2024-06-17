package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 网关参数校验文档侧回归测试
 *
 * @author auto create
 * @since 1.0, 2023-07-14 16:20:36
 */
public class AlipayDataDataserviceVerifyAaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8563242465128985558L;

	/**
	 * 米搜狐的
	 */
	@ApiField("booleanaa")
	private Boolean booleanaa;

	/**
	 * 排除最大值不拍最小
88,66
	 */
	@ApiField("c")
	private Long c;

	/**
	 * 分
	 */
	@ApiField("ceisjnvikdv")
	private Date ceisjnvikdv;

	/**
	 * 列表类型，时间类型
	 */
	@ApiListField("datecc")
	@ApiField("date")
	private List<Date> datecc;

	/**
	 * 时间类型
	 */
	@ApiListField("datesy")
	@ApiField("date")
	private List<Date> datesy;

	/**
	 * 55,56都不排除这个值
	 */
	@ApiField("dd")
	private Long dd;

	/**
	 * 座机号码
	 */
	@ApiField("dddddcfnj")
	private String dddddcfnj;

	/**
	 * 78,66最大最小都排除
	 */
	@ApiField("dddvg")
	private Long dddvg;

	/**
	 * ['false','true列表类型的boolean
	 */
	@ApiListField("ddjhgfd")
	@ApiField("boolean")
	private List<Boolean> ddjhgfd;

	/**
	 * 排除最小值
78,66
	 */
	@ApiListField("de")
	@ApiField("number")
	private List<Long> de;

	/**
	 * t
	 */
	@ApiField("f")
	private String f;

	/**
	 * 是
	 */
	@ApiField("fuaza")
	private CanshujiaoyanPeihuan fuaza;

	/**
	 * 1
	 */
	@ApiField("fuza")
	private CanshujiaoyanPeihuan fuza;

	/**
	 * 排除最小值 55，78
	 */
	@ApiListField("gr")
	@ApiField("price")
	private List<String> gr;

	/**
	 * 78,38 最大值最小值同时排除
	 */
	@ApiField("hy")
	private String hy;

	/**
	 * 66,99最大最小都不排除
	 */
	@ApiField("ll")
	private String ll;

	/**
	 * 66,78  排除最大值
	 */
	@ApiField("prcides")
	private String prcides;

	/**
	 * 最大值56，最小值66
	 */
	@ApiField("stringstylea")
	private String stringstylea;

	/**
	 * 最大长度78，最小长度66
最多元素99，最小元素88
	 */
	@ApiListField("stringstyleb")
	@ApiField("string")
	private List<String> stringstyleb;

	public Boolean getBooleanaa() {
		return this.booleanaa;
	}
	public void setBooleanaa(Boolean booleanaa) {
		this.booleanaa = booleanaa;
	}

	public Long getC() {
		return this.c;
	}
	public void setC(Long c) {
		this.c = c;
	}

	public Date getCeisjnvikdv() {
		return this.ceisjnvikdv;
	}
	public void setCeisjnvikdv(Date ceisjnvikdv) {
		this.ceisjnvikdv = ceisjnvikdv;
	}

	public List<Date> getDatecc() {
		return this.datecc;
	}
	public void setDatecc(List<Date> datecc) {
		this.datecc = datecc;
	}

	public List<Date> getDatesy() {
		return this.datesy;
	}
	public void setDatesy(List<Date> datesy) {
		this.datesy = datesy;
	}

	public Long getDd() {
		return this.dd;
	}
	public void setDd(Long dd) {
		this.dd = dd;
	}

	public String getDddddcfnj() {
		return this.dddddcfnj;
	}
	public void setDddddcfnj(String dddddcfnj) {
		this.dddddcfnj = dddddcfnj;
	}

	public Long getDddvg() {
		return this.dddvg;
	}
	public void setDddvg(Long dddvg) {
		this.dddvg = dddvg;
	}

	public List<Boolean> getDdjhgfd() {
		return this.ddjhgfd;
	}
	public void setDdjhgfd(List<Boolean> ddjhgfd) {
		this.ddjhgfd = ddjhgfd;
	}

	public List<Long> getDe() {
		return this.de;
	}
	public void setDe(List<Long> de) {
		this.de = de;
	}

	public String getF() {
		return this.f;
	}
	public void setF(String f) {
		this.f = f;
	}

	public CanshujiaoyanPeihuan getFuaza() {
		return this.fuaza;
	}
	public void setFuaza(CanshujiaoyanPeihuan fuaza) {
		this.fuaza = fuaza;
	}

	public CanshujiaoyanPeihuan getFuza() {
		return this.fuza;
	}
	public void setFuza(CanshujiaoyanPeihuan fuza) {
		this.fuza = fuza;
	}

	public List<String> getGr() {
		return this.gr;
	}
	public void setGr(List<String> gr) {
		this.gr = gr;
	}

	public String getHy() {
		return this.hy;
	}
	public void setHy(String hy) {
		this.hy = hy;
	}

	public String getLl() {
		return this.ll;
	}
	public void setLl(String ll) {
		this.ll = ll;
	}

	public String getPrcides() {
		return this.prcides;
	}
	public void setPrcides(String prcides) {
		this.prcides = prcides;
	}

	public String getStringstylea() {
		return this.stringstylea;
	}
	public void setStringstylea(String stringstylea) {
		this.stringstylea = stringstylea;
	}

	public List<String> getStringstyleb() {
		return this.stringstyleb;
	}
	public void setStringstyleb(List<String> stringstyleb) {
		this.stringstyleb = stringstyleb;
	}

}
