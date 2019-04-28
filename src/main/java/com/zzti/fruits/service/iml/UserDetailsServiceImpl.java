package com.zzti.fruits.service.iml;


import com.zzti.fruits.mapper.SysuserMapper;
import com.zzti.fruits.pojo.Sysuser;
import com.zzti.fruits.pojo.SysuserExample;
import com.zzti.fruits.service.SysuserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
//@Component("userDetailsService")
public class UserDetailsServiceImpl  {
//implements UserDetailsService
//	@Autowired
//	private SysuserMapper sysuserMapper;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		List<GrantedAuthority> grantAuths = new ArrayList();
//		SysuserExample sysuserExample=new SysuserExample();
//		sysuserExample.createCriteria().andUnameEqualTo(username);
//		List<Sysuser> sysusers = sysuserMapper.selectByExample(sysuserExample);
//		if(sysusers.size()>0) {
//			return new User(username, sysusers.get(0).getUpass(), grantAuths);
//		}else{
//			return null;
//		}
//
//	}

}
