package com.example.demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class JwtUtil {

    private String SECRET_KEY = "secret";
    /**
     * Generates a token for the given username.
     *
     * @param  username  the username for which the token is generated
     * @return           the generated token
     */
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
    /**
     * Validates the given token for the specified username.
     *
     * @param  token    the token to be validated
     * @param  username the username to be checked against the token
     * @return          true if the username matches the decoded username from the token, false otherwise
     */
    public Boolean validateToken(String token, String username) {
        final String decodedUsername = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();

        return username.equals(decodedUsername);
    }
}
