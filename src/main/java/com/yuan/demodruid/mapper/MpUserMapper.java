package com.yuan.demodruid.mapper;

import com.yuan.demodruid.entity.MpUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yuan
 * @since 2020-06-03
 */
public interface MpUserMapper extends BaseMapper<MpUser> {


    int groupByAdress(@Param("address") String address);

}
