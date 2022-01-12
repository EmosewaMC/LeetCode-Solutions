#pragma once

#include <vector>

using std::vector;
/**
* @brief Class finds distance between two points.
* Typedefs make this slower however I wanted to mess about with them.
*
* @param points Vector of Vector that contains points to check.
* @param queries Vector of Vector that contains circles to check.
* @return Vector of number of points within area of queries.
*/

class DistanceTwoPoints {
    typedef int32_t Cardinal;
    typedef int32_t Radius;

  public:
    vector<int> countPoints(vector< vector<int> > &points, vector< vector<int> > &queries);
    float GetDistance(vector<int> &point, vector<int> &circle);

  private:
    static const Cardinal XPosition = 0;
    static const Cardinal YPosition = 1;
    static const Radius radius = 2;
};