package com.industrytech.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "email")
public class MailComponent {

    List<EmailConfig> configs;

    public List<EmailConfig> getConfigs() {
        return configs;
    }

    public void setConfigs(List<EmailConfig> configs) {
        this.configs = configs;
    }

    public static class EmailConfig{
        String host;
        List<String> domains;
        Integer smtpPort;
        String user;
        String password;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public List<String> getDomains() {
            return domains;
        }

        public void setDomains(List<String> domains) {
            this.domains = domains;
        }

        public Integer getSmtpPort() {
            return smtpPort;
        }

        public void setSmtpPort(Integer smtpPort) {
            this.smtpPort = smtpPort;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

}
