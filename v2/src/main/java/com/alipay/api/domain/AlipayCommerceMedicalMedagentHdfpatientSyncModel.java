package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫医带患就诊人同步AQ
 *
 * @author auto create
 * @since 1.0, 2025-12-19 19:02:42
 */
public class AlipayCommerceMedicalMedagentHdfpatientSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2737164299395771582L;

	/**
	 * AQ用户ID
	 */
	@ApiField("aq_u_id")
	private String aqUId;

	/**
	 * 出生日期，格式yyyy-MM-dd
	 */
	@ApiField("birth_day")
	private String birthDay;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 就诊人ID
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * SELF(0, "本人"),
    FAMILY(1, "家庭成员"),
    RELATIVE(2, "亲戚"),
    FRIEND(3, "朋友"),
    OTHER(4, "其他");
	 */
	@ApiField("relation")
	private Long relation;

	/**
	 * 性别，0-女 1-男 2-未知
	 */
	@ApiField("sex")
	private Long sex;

	public String getAqUId() {
		return this.aqUId;
	}
	public void setAqUId(String aqUId) {
		this.aqUId = aqUId;
	}

	public String getBirthDay() {
		return this.birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Long getRelation() {
		return this.relation;
	}
	public void setRelation(Long relation) {
		this.relation = relation;
	}

	public Long getSex() {
		return this.sex;
	}
	public void setSex(Long sex) {
		this.sex = sex;
	}

}
