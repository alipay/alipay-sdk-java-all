package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体科所-自测数据-运动指导
 *
 * @author auto create
 * @since 1.0, 2023-12-15 11:48:58
 */
public class CissSportsGuidance extends AlipayObject {

	private static final long serialVersionUID = 2315547492311988349L;

	/**
	 * 注意事项
	 */
	@ApiField("attention")
	private String attention;

	/**
	 * 练习强度
	 */
	@ApiField("exercise_intensity")
	private String exerciseIntensity;

	/**
	 * 练习要点
	 */
	@ApiField("exercise_points")
	private String exercisePoints;

	/**
	 * 练习名称
	 */
	@ApiField("exercise_type")
	private String exerciseType;

	/**
	 * 运动类型ID
	 */
	@ApiField("exercise_type_id")
	private String exerciseTypeId;

	/**
	 * ID
	 */
	@ApiField("id")
	private Long id;

	public String getAttention() {
		return this.attention;
	}
	public void setAttention(String attention) {
		this.attention = attention;
	}

	public String getExerciseIntensity() {
		return this.exerciseIntensity;
	}
	public void setExerciseIntensity(String exerciseIntensity) {
		this.exerciseIntensity = exerciseIntensity;
	}

	public String getExercisePoints() {
		return this.exercisePoints;
	}
	public void setExercisePoints(String exercisePoints) {
		this.exercisePoints = exercisePoints;
	}

	public String getExerciseType() {
		return this.exerciseType;
	}
	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public String getExerciseTypeId() {
		return this.exerciseTypeId;
	}
	public void setExerciseTypeId(String exerciseTypeId) {
		this.exerciseTypeId = exerciseTypeId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
