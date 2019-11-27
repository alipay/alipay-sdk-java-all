package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监护人信息
 *
 * @author auto create
 * @since 1.0, 2018-11-09 12:14:56
 */
public class Guardian extends AlipayObject {

	private static final long serialVersionUID = 6366899162292845438L;

	/**
	 * 家庭关系代码，2位：
51 父亲
52 母亲
57 继父或养父
58 继母或养母
59 其他父母关系
61 祖父
62 祖母
63 外祖父（外公）
64 外祖母（外婆）
71 兄
72 嫂
73 弟
74 弟媳
75 姐姐
76 姐夫
77 妹妹
78 妹夫
81 伯父
82 伯母
83 叔父
84 婶母
85 舅父
86 舅母
87 姨父
88 姨母
89 姑父
90 姑母
	 */
	@ApiField("grardian_relation")
	private String grardianRelation;

	/**
	 * 监护人证件号
	 */
	@ApiField("guardian_cert_no")
	private String guardianCertNo;

	/**
	 * 监护人证件类型，默认为1：
1 居民身份证
2 军官证
3 士兵证
4 文职干部证
5 部队离退休证
6 香港特区护照/身份证明
7 澳门特区护照/身份证明
8 台湾居民来往大陆通行证
9 境外永久居住证
A 护照
B 户口薄
Z 其他
	 */
	@ApiField("guardian_cert_type")
	private String guardianCertType;

	/**
	 * 监护人手机号
	 */
	@ApiField("guardian_mobile")
	private String guardianMobile;

	/**
	 * 监护人姓名
	 */
	@ApiField("guardian_name")
	private String guardianName;

	public String getGrardianRelation() {
		return this.grardianRelation;
	}
	public void setGrardianRelation(String grardianRelation) {
		this.grardianRelation = grardianRelation;
	}

	public String getGuardianCertNo() {
		return this.guardianCertNo;
	}
	public void setGuardianCertNo(String guardianCertNo) {
		this.guardianCertNo = guardianCertNo;
	}

	public String getGuardianCertType() {
		return this.guardianCertType;
	}
	public void setGuardianCertType(String guardianCertType) {
		this.guardianCertType = guardianCertType;
	}

	public String getGuardianMobile() {
		return this.guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}

	public String getGuardianName() {
		return this.guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

}
